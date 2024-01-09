package Syntax.Auftrag;

public class Aufgabe13 {
    public static void main(String[] args) {

        // Auch Java kennt das Casten von Datentypen

        int i = Integer.parseInt("10");
        double d = Double.parseDouble("5.5");
        String text = Integer.toString(100);


        // Neu ist jedoch das Casten von Datentypen mit unterschiedlicher Wertigkeit. Gemeint ist hier Double  Float oder Long    Integer.
        // Hier wird zwischen implizitem und explizitem Cast unterschieden.
        // Nichts beachten musst du bei einem Cast von einem niederwertigen zu einem höherwertigen Datentyp, also Integer zu Long oder Float zu Double.

        int wert = 10;
        long wert2 = 30;

        wert2 = wert;

        // Jedoch beim Casten eines höherwertigen zu einem niederwertigen Datentyp, musst du dies explizit angeben.
        // Falls der Wert in der Long Variable zu gross ist, wird dein Code eine Exception werfen bzw. abbrechen.

        int wert3 = 10;
        float wert4 = 30.5f;

        wert3 = (int) wert4;


        // Explizit heisst, du als Programmierer musst etwas selbst hinschreiben.
        // Implizit heisst, es ist bereits etwas unsichtbares vorhanden, das du nicht mehr hinschreiben musst.


        // Aufgabe


        long[] numbersAsLong = {10, 20, 30};

        int[] numberAsInteger = new int[numbersAsLong.length];


        // Konvertierung von long zu int und Kopieren der Werte
        for (int j = 0; j < numbersAsLong.length; j++) {
            numberAsInteger[j] = (int) numbersAsLong[j]; //explizites casten
        }

        for (int number : numberAsInteger) {
            System.out.println(number);
        }


    }
}
