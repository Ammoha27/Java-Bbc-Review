package Klassen.Auftrag;

public class Rectangle {
    public static void main(String[] args) {

        System.out.println("Umfang " + calculateArea(4,5) + " cm ");
        System.out.println("Fläche " + calculateCircumreference(4,5) + " cm");
    }

    static double calculateArea(double width, double height){
        return width * height;
    }
    static double calculateCircumreference(double width, double height){
        return 2 * (width + height);
    }



}
