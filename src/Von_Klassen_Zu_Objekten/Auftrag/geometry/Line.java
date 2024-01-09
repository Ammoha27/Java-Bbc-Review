package Von_Klassen_Zu_Objekten.Auftrag.geometry;

import Von_Klassen_Zu_Objekten.Auftrag.Klassen_als_Methodenparameter.Point;

public class Line {
    public static double calculateDistance(Point p1, Point p2){
        return Math.sqrt((p2.getY() - p1.getY()) * (p2.getY() - p1.getY()) + (p2.getX() - p1.getX()) * (p2.getX() - p1.getX()));
    }
}
