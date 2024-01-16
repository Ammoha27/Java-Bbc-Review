package Vererbung.Teil1.Auftrag.geometryredundant;

import java.util.Objects;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


//    @Override
//    public boolean equals(Object obj) {
//        // Prüfen, ob das gegebene Objekt dasselbe ist
//        if (this == obj) {
//            return true;
//        }
//        // Prüfen, ob das gegebene Objekt null ist oder ob die Klassen unterschiedlich sind
//        if (obj == null || getClass() != obj.getClass()) {
//            return false;
//        }
//        // Cast das Objekt zu Point und vergleichen Sie die Koordinaten
//        Point point = (Point) obj;
//        return x == point.x && y == point.y;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}