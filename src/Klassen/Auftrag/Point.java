package Klassen.Auftrag;

public class Point {

    static int X;
    static int Y;

    public static int getX() {
        return X;
    }

    public static int getY() {
        return Y;
    }

    public static void setX(int x) {
        X = x;
    }

    public static void setY(int y) {
        Y = y;
    }

    public static void main(String[] args) {
        Point.setX(2);
        Point.setY(3);

        int x = Point.getX();
        int y = Point.getY();

        System.out.println(x + "," + y);
    }


}
