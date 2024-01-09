package SichtbarkeitPackage.Auftrag.gemoetry;


public class Circle {

    static final double PI = 3.14;

    static double calculateArea(int radius) {
        double area = PI * (radius * radius);
        return area;
    }

    static double calculateCircumference(int radius) {
        double circumference = 2 * radius * radius;
        return circumference;
    }
}

