package Vererbung.Teil1.Auftrag.geometryredundant;


public class App {

    public static void main(String[] args) {
        Point point = new Point(10,22);

        Rectangle rectangle = new Rectangle(point, 10,20);
        System.out.println(rectangle.getPosition());


    }
}
