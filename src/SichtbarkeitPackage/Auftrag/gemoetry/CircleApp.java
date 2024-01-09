package SichtbarkeitPackage.Auftrag.gemoetry;

import static SichtbarkeitPackage.Auftrag.gemoetry.Circle.calculateArea;

public class CircleApp {

    public static void main(String[] args) {
        int radius = 5;

        double area = Circle.calculateArea(radius);
        String areaAsString = Double.toString(area);
        System.out.println("Kreisfläche bei Radius 5 cm: " + areaAsString + "cm");

        double circumference = Circle.calculateCircumference(radius);
        String circumferenceAsString = Double.toString(circumference);
        System.out.println("Kreisumfang Radius 5cm: " + circumferenceAsString + "cm");
    }
}
