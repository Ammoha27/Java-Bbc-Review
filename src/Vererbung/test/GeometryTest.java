package Vererbung.test;

import Vererbung.Teil1.Auftrag.geometryredundant.Circle;
import Vererbung.Teil1.Auftrag.geometryredundant.Point;
import Vererbung.Teil1.Auftrag.geometryredundant.Rectangle;
import Vererbung.Teil1.Auftrag.geometryredundant.TextRectangle;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeometryTest {
    @Test
    void rectancle_calculateArea() {
        Rectangle rect = new Rectangle(new Point(1,1),4,5);
        assertEquals(20, rect.calculateArea(), 0.0001);
    }

    @Test
    void rectangle_calculateCircumference() {
        Rectangle rect = new Rectangle(new Point(1,1),4,5);
        assertEquals(18, rect.calculateCirucmference(), 0.0001);
    }

    @Test
    void circle_calculateArea() {
        Circle circle = new Circle(new Point(1,1), 5);
        assertEquals(25 * Math.PI, circle.calculateArea(), 0.0001);
    }

    @Test
    void circle_calculateCircumference() {
        Circle circle = new Circle(new Point(1,1),5);
        assertEquals(10 * Math.PI, circle.calculateCirucmference(), 0.0001);
    }



    @Test
    void textRectangle_calculateArea() {
        TextRectangle textRectangle = new TextRectangle("My Text", new Point(1,1), 4, 5);
        assertEquals(20, textRectangle.calculateArea(),0.0001);
    }

    @Test
    void textRectangle_calculateCircumference() {
        TextRectangle textRectangle = new TextRectangle("My Text", new Point(1,1), 4, 5);
        assertEquals(18, textRectangle.calculateCirucmference(), 0.0001);
    }

    @Test
    void textRectangle_instanceOf_Rectangle() {
        TextRectangle textRectangle = new TextRectangle("My Text", new Point(1,1), 4, 5);
        assertTrue(textRectangle instanceof Rectangle); // überprüft ob textRectangle eine unterklasse von Rectangle ist.
    }

    @Test
    void textRectangle_getText() {
        TextRectangle textRectangle = new TextRectangle("My Text", new Point(1,1), 4, 5);
        assertEquals("My Text", textRectangle.getText());
    }



    @Test
    void circle_getPosition_CorrectPositionGetReturned(){
        Point position = new Point(1, 1);
        Circle circle = new Circle(position,2);
        Point actualPoint = circle.getPosition(); // ich hole die Position des Kreises und speichern diese Position in der Variablen actualPoint das ein Point-Objekt isthä
        assertEquals(position, actualPoint);
    }

    // actualPoint muss vom Typ Point sein, weil es einen 2D-Punkt mit zwei Koordinaten (x und y) repräsentiert, während ein int nur einen einzelnen numerischen Wert speichern kann.





/*
Der Test schlägt fehl, weil assertEquals() intern equals() aufruft,
und zwei unterschiedliche Instanzen mitgegeben wurden. Die beiden Punktinstanzen haben aber die gleichen Koordinaten und sind inhaltlich laut unserer Definition gleich.
Überschreibe die equals()-Methode in der Klasse Point so, dass der Test grün wird.


Mit assertEquals(new Point(1, 1), actualPoint) vergleichen ich das Point-Objekt mit einem neu erstellten Point-Objekt,
das zwar die gleichen Koordinaten hat, aber eine andere Referenz (Adresse im Speicher) ist.


Um den Test zu bestehen,  muss ich die equals()-Methode in der Point-Klasse überschreiben,
um die Gleichheit basierend auf den Koordinaten (x und y) und nicht auf den Referenzen zu überprüfen.
*/

}
