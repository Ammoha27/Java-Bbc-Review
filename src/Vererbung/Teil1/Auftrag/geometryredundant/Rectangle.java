package Vererbung.Teil1.Auftrag.geometryredundant;

public class Rectangle extends Shape {
    protected int width;
    protected int height;


    public Rectangle(Point topLeft, int width, int height) {
        this.position = topLeft;
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }



    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculateCirucmference() {
        return 2 * (width + height);
    }
}


// @Override zeigt an, dass die darunterliegende Methode eine Methode einer übergeordneten Klasse oder eines implementierten Interfaces überschreibt.
