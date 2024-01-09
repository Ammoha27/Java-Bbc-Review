package Von_Klassen_Zu_Objekten.Klassen_als_Datentyp.Rückgabetyp;

public class App {
    public static void main(String[] args) {
        Point p = PointFactory.createPoint(3,2);
        int x = p.getX();
        int y = p.getY();
        System.out.println(x);
        System.out.println(y);
    }
}
