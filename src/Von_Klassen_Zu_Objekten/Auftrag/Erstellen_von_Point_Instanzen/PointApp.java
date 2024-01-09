package Von_Klassen_Zu_Objekten.Auftrag.Erstellen_von_Point_Instanzen;

public class PointApp {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();

        p1.setX(1);
        p1.setY(2);

        p2.setX(3);
        p2.setY(4);

        int x = p1.getX();
        int y = p1.getY();
        System.out.print("Point 1: " + "x= " + x);
        System.out.print(" y= " + y);

        System.out.println();

        int x2 = p2.getX();
        int y2 = p2.getY();
        System.out.print("Point 2: " + "x= " + x2);
        System.out.print(" y= " + y2);
    }
}
