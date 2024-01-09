package Von_Klassen_Zu_Objekten.Klassen_als_Datentyp.Rückgabetyp;

public class PointFactory {
    public static Point createPoint(int x, int y) {
        Point p = new Point();
        p.setX(x);
        p.setY(y);
        return p;
    }
}
