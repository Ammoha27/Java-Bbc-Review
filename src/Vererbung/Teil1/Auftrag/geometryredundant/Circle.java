package Vererbung.Teil1.Auftrag.geometryredundant;

public class Circle extends Shape {
    private int radius;

    public Circle(Point position, int radius) {
        this.radius = radius;
        this.position = position;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculateCirucmference() {
        return 2 * Math.PI * radius;
    }
}
