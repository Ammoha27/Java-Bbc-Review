package Klassen.Auftrag;

public class BbcMath {

    public static void main(String[] args) {

        int i = 10;
        long l = 10;
        float f = 10;
        double d = 10;

        // Aufgaben zu Methodenüberladung:
        // Schreibe die Methode "add" viermal. Verwende immer den Methodennamen "add" und Methodenüberladung.


         System.out.println("Add mit Integer: " + add(i,i));
         System.out.println("Add mit Long: " + add(l, l));
         System.out.println("Add mit Float: " + add(f, f));
         System.out.println("Add mit Double: " + add(d, d));


         System.out.println("Ist 7 gerade? " + isEven(7));
         System.out.println("Ist 8 gerade? " + isEven(8));
    }

     static int add(int a, int b) {
        return a + b;
    }

    static long add(long a, long b){
        return a + b;
    }

    static float add(float a, float b) {
        return a + b;
    }
    static double add(double a, double b){
        return a + b;
    }

    static boolean isEven(int number){
        return number % 2 == 0;
    }

}
