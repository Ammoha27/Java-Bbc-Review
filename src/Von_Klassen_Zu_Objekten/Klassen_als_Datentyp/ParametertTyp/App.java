package Von_Klassen_Zu_Objekten.Klassen_als_Datentyp;

public class App {
    public static void main(String[] args) {


        Point p1 = new Point();
        p1.setX(2);
        p1.setY(3);

        Point p2 = new Point();
        p2.setX(4);
        p2.setY(6);

        System.out.println(p1.getX() + "," + p1.getY());
        System.out.println(p2.getX() + "," + p2.getY());

        double distance = Line.calcDistance(p1,p2);
        System.out.println(distance);
    }
}
