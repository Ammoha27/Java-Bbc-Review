package Syntax.Auftrag;

public class Aufgabe1 {
    public static void main(String[] args) {

        int a = 1;
		double b = 8.0;
		// Dies ist ein Kommentar
        double resultat = a + b;
        String text = "Das Resultat ist: " + resultat;

        if (resultat < 10.0) {
            System.out.println("Gratulation!");
        }	else  {
                System.out.println(text);
		}
    }
}
