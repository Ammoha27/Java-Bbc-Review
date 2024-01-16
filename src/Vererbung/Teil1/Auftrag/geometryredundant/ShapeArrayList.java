package Vererbung.Teil1.Auftrag.geometryredundant;

import java.util.ArrayList;
import java.util.List;

public class ShapeArrayList extends ArrayList<Shape> {


    public int getAmountOfCircles(){
        int amountOfCircles = 0;
            for (Shape shape : this) {
                if (shape instanceof Circle) {
                    amountOfCircles++;
                }
            }
        return amountOfCircles;
    }

    // this bezieht sich auf die aktuelle Instanz der ShapeArrayList-Klasse.
    // Es ermöglicht das Durchlaufen aller Shape-Objekte, die in dieser Instanz gespeichert sind, um die Anzahl der Circle-Objekte in der Liste zu zählen.



    public int getAmountOfRectangles(){
        int amountOfRectangles = 0;
        for (Shape shape: this){
            if (shape instanceof Rectangle){
                amountOfRectangles++;
            }
        }
        return amountOfRectangles;
    }
    public  List<Rectangle> getAllRectangles(){
        List<Rectangle> rectangles = new ArrayList<>();
        for (Shape shape : this){
            if (shape instanceof Rectangle){
                rectangles.add((Rectangle) shape) ; // Der ursprüngliche Code funktionierte nicht, weil ein Objekt vom Typ Shape nicht direkt einer Liste von Rectangle-Objekten hinzugefügt werden kann, ohne es zu Rectangle zu casten.
            }

        }
        return rectangles;
    }
    public  List<Circle> getAllCircles(){
    List<Circle> circles = new ArrayList<>();
    for (Shape shape : this){
        if (shape instanceof Circle){
            circles.add((Circle) shape);
        }
    }
    return circles;
    }
}


// Durch die Verwendung von Generics gewährleistet ArrayList<Shape>, dass nur Objekte vom Typ Shape (oder seinen Unterklassen) in dieser Liste gespeichert werden können

// ShapeArrayList ist eine Art ArrayList. Da ShapeArrayList von ArrayList<Shape> erbt, ist es eine spezialisierte Form der ArrayList, die speziell dafür ausgelegt ist, Objekte des Typs Shape zu speichern und zu verwalten.

// die Instanz von ShapeArrayList kann Objekte von Shape speichern
