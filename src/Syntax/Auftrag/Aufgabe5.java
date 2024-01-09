package Syntax.Auftrag;

import javax.swing.*;

public class Aufgabe5 {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog(null, "Bitte Namen eingeben");
        int zahl = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte Zahl eingeben")); //Integer.parseInt wird verwendetn um den eingegebenen String in ein int Wrt umzuwandeln


        if (zahl > 0){
            System.out.println("Deine Zahl ist grösser als 0");
        }
        else if (zahl < 0){
            System.out.println("Deine Zahl ist kleiner als 0");
        }
        else if (zahl == 0){
            System.out.println("Deine Zahl ist die 0");
        }

    }
}





// Die beiden Zeilen verwenden JOptionPane aus dem javax.swing Paket von Java, um Dialogfenster für Benutzereingaben zu erzeugen.
// Java Swing: einem GUI-Widget-Toolkit, das es erlaubt, fensterbasierte Anwendungen zu erstellen.