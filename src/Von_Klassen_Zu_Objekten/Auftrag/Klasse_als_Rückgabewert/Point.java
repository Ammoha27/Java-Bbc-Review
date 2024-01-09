package Von_Klassen_Zu_Objekten.Auftrag.Klasse_als_Rückgabewert;

public class Point {
    private int x;
    private int y;

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public static Point createPoint(int x, int y){
        Point p1 = new Point();
        p1.setX(x);
        p1.setY(y);
        return p1;
    }
}
