package Syntax.Auftrag;

import javax.swing.*;

public class Aufgabe9 {


    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog(null, "Bitte geben sie ihren Namen an");
        double kg = Double.parseDouble(JOptionPane.showInputDialog(null, "Bitte Gewicht eingeben")); //Diese Methode versucht, den von JOptionPane.showInputDialog zurückgegebenen String in einen double-Wert umzuwandeln.
        double m = Double.parseDouble(JOptionPane.showInputDialog(null, "Bitte Grösse eingeben"));

        double BMI = kg / Math.pow(m, 2);

        System.out.println(name + " dein Bodymassindex beträgt " + BMI);
    }



}
