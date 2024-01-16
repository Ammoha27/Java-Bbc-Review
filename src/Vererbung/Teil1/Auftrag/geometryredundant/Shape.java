package Vererbung.Teil1.Auftrag.geometryredundant;

import java.util.Objects;

public abstract class Shape {
    protected Color fill = Color.Black;
    protected Point position = new Point(0,0);


    protected abstract double calculateArea();
    protected abstract double calculateCirucmference();

    public Color getFill(){
        return fill;
    }

    public void setFill(Color fill) {
        this.fill = fill;
    }

    public Point getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return fill == shape.fill && Objects.equals(position, shape.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fill, position);
    }

    public void setPosition(Point position) {
        this.position = position;
    }
}


// abstract verhindert das wir eine Instanz der Klasse erstellen.
// Es macht kein Sinn eine Instanz von Shape zu erstellen, denn Shape könnte alles sein und man kann es nicht als Form darstellen.


// abstract bei der Method
// man kann sagen, wir haben die Methode deklariert, jedoch noch nicht implementiert bzw bei einer variable hies es initalisiert
// Mit der abstrakten Deklaration von Methoden in einer abstrakten Klasse können wir andere Klassen die von der abstrakten Klasse erben zwingen, gewisse Methoden zu implementieren.