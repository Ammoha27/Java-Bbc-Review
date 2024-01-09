package Von_Klassen_Zu_Objekten.Auftrag.Klassen_als_Methodenparameter;



import Von_Klassen_Zu_Objekten.Auftrag.geometry.Line;

public class LineApp {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();

        p1.setX(1);
        p1.setY(2);

        p2.setX(3);
        p2.setY(4);

        int x = p1.getX();
        int y = p1.getY();


        int x2 = p2.getX();
        int y2 = p2.getY();


        double distance = Line.calculateDistance(p1, p2);
        System.out.println("Distanz zwischen P1 und P2 ist: " + distance);


    }
}
