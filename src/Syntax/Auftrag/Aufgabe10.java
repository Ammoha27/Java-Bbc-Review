package Syntax.Auftrag;

import javax.swing.*;

public class Aufgabe10 {
    public static void main(String[] args) {

        int zahl = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte erste Zahl eingeben"));
        String operator = JOptionPane.showInputDialog(null, "Bitte operator eingeben");
        int zahl2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte zweite Zahl eingeben"));

        int result = 0;
        switch (operator) {
            case "+":
                result = zahl + zahl2;
                break;
            case "-":
                result = zahl - zahl2;
                break;
            case "*":
                result = zahl * zahl2;
                break;
            case "/":
                result = zahl / zahl2;
                break;
            default:
                System.out.println("Operator Ungültig");
        }
        JOptionPane.showMessageDialog(null, zahl + " " + operator + " " + zahl2 + " = " + result);


    }
}
