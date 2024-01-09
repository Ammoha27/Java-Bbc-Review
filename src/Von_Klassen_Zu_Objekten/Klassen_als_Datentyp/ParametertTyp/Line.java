package Von_Klassen_Zu_Objekten.Klassen_als_Datentyp;

public class Line {
    public static double calcDistance(Point p1, Point p2){
        return Math.sqrt((p2.getY() - p1.getY()) * (p2.getY() - p1.getY()) + (p2.getX() - p1.getX()) * (p2.getX() - p1.getX()));
    }
}

