package Von_Klassen_Zu_Objekten.Auftrag.Klasse_als_Rückgabewert;


public class LineApp {

    public static void main(String[] args) {

        Point p1 = Point.createPoint(1,1);
        Point p2 = Point.createPoint(2,2);
        System.out.println(p1.getX());
        System.out.println(p2.getY());




    }

}
