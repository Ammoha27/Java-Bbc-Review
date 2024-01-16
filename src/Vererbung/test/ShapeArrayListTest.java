package Vererbung.test;


import Vererbung.Teil1.Auftrag.geometryredundant.Circle;
import Vererbung.Teil1.Auftrag.geometryredundant.Point;
import Vererbung.Teil1.Auftrag.geometryredundant.Rectangle;
import Vererbung.Teil1.Auftrag.geometryredundant.ShapeArrayList;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapeArrayListTest {

    @Test
    void shapeArrayList_ContainsOneCircle() {
        ShapeArrayList shapes = new ShapeArrayList();
        shapes.add(new Circle(new Point(0,0), 10));
        assertEquals(1, shapes.getAmountOfCircles());
    }

    @Test
    void shapeArrayList_ContainsFiftyCircles() {
        ShapeArrayList shapes = new ShapeArrayList();
        for (int i = 0; i < 50; i++) {
            shapes.add(new Circle(new Point(0,0), 10));
        }
        assertEquals(50, shapes.getAmountOfCircles());
    }

    @Test
    void shapeArrayList_ContainsOneRectangle() {
        ShapeArrayList shapes = new ShapeArrayList();
        shapes.add(new Rectangle(new Point(1,1), 4, 5));
        assertEquals(1, shapes.getAmountOfRectangles());
    }

    @Test
    void shapeArrayList_ContainsFiftyRectangles() {
        ShapeArrayList shapes = new ShapeArrayList();
        for (int i = 0; i < 50; i++) {
            shapes.add(new Rectangle(new Point(1,1), 4, 5));
        }
        assertEquals(50, shapes.getAmountOfRectangles());
    }


    @Test
    void shapeArrayList_GetAllRectanglesCorrect(){
        ShapeArrayList shapes = new ShapeArrayList();

        // We want to make sure to not only have rectangles in our ShapeArrayList
        for (int i = 0; i < 10; i++) {
            shapes.add(new Circle(new Point(1,1), 10));
        }

        List<Rectangle> expectedRectangles = new ArrayList<>(); //expectedRectangles eine Liste von Objekten des Typs Rectangle speichern wird.
        for (int i = 0; i < 10; i++) {
            Rectangle rectangle = new Rectangle(new Point(1,1), 4, 5);
            expectedRectangles.add(rectangle);
            shapes.add(rectangle);
        }

        List<Rectangle> resultRectangles = shapes.getAllRectangles(); //Diese sollte alle Rectangle-Objekte aus der shapes-Liste zurückgeben und wird in resultRectangles gespeichert.
        for (Rectangle rectangle : resultRectangles) {
            expectedRectangles.remove(rectangle);
        }

        assertEquals(0,expectedRectangles.size());
    }

    // Am Ende wird überprüft, ob expectedRectangles leer ist, was bedeuten würde, dass alle Rectangle-Objekte, die zu shapes hinzugefügt wurden, korrekt von getAllRectangles zurückgegeben und aus expectedRectangles entfernt wurden.


    @Test
    void shapeArrayList_GetAllCirclesCorrect(){
        ShapeArrayList shapes = new ShapeArrayList();

        // We want to make sure to not only have circles in our ShapeArrayList
        for (int i = 0; i < 10; i++) {
            shapes.add(new Rectangle(new Point(1,1), 4, 5));
        }

        List<Circle> expectedCircles = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Circle circle = new Circle(new Point(1,1), 10);
            expectedCircles.add(circle);
            shapes.add(circle);
        }

        List<Circle> resultCircles = shapes.getAllCircles();
        for (Circle circle : resultCircles) {
            expectedCircles.remove(circle);
        }

        assertEquals(0, expectedCircles.size());
    }



}