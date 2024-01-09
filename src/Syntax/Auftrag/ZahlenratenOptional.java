package Syntax.Auftrag;

import javax.swing.*;

public class ZahlenratenOptional {
    public static void main(String[] args) {

        double  eratteteZahl = Math.floor(Math.random() * 100);
        int versuche = 0;


        while(true){
            int zahl = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte deine Zahl eingeben"));
            if (eratteteZahl == zahl){
                System.out.println("Du hast die Zahl " + zahl + " erfolgreich eratten");
                System.out.println("Du hast " + versuche + " verusche " + " gebraucht ");
                break;
            }
            else {
                versuche++;
             System.out.println("Falsch");
             if (zahl < eratteteZahl){
                 System.out.println("Deine Zahl ist kleiner als die zu erattende Zahl");
             }
             else if (zahl > eratteteZahl){
                 System.out.println("Deine Zahl ist grösser als die zu erattende Zahl");
             }
            }
        }
    }
}

// to be continued