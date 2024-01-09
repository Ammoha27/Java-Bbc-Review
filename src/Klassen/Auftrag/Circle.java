package Klassen.Auftrag;

public class Circle {

    public static void main(String[] args) {

        int radius = 5;

        double areaCalculate = calculateArea(radius);

        System.out.println("Kreisfläche bei Radius 5 cm: " + areaCalculate + "cm");

        double circumference = calculateCircumference(radius);

        System.out.println("Kreisumfang Radius 5cm: " + circumference + "cm");
    }

    static double calculateArea(int radius) {
        return Math.PI * Math.pow(radius,2);
    }

    static double calculateCircumference(int radius) {
        return 2 * Math.PI * radius;
    }

}
