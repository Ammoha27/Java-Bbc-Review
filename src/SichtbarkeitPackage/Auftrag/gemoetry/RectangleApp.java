package SichtbarkeitPackage.Auftrag.gemoetry;

import static SichtbarkeitPackage.Auftrag.gemoetry.Rectangle.calculateArea;

public class RectangleApp {

    public static void main(String[] args) {
        double area = Rectangle.calculateArea(4, 4);
        String areaAsString = Double.toString(area); // area wird zu einem String konventiert
        System.out.println("Flaeche: " + areaAsString + "cm");

        double circumference = Rectangle.calculateCircumference(4, 4);
        String circumferenceAsString = Double.toString(circumference);
        System.out.println("Umfang: " + circumferenceAsString + "cm");
    }


    

}

