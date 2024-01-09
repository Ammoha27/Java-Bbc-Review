package Syntax.Auftrag;

import javax.swing.*;

public class Aufgabe6 {

    public static void main(String[] args) {
        String myname = "Amir";


        while(true){
            String name = JOptionPane.showInputDialog(null, "Bitte Namen eingeben");
            if (name.equals(myname)){
                System.out.println("Das bin ich");
                break;
            }
            else {
                System.out.println("Das bin ich nicht");
            }
        }

    }
}

// die Schleife wird unendlich mal wiederholt. Sie wird erst dann gebrochen wenn der richtige Name eingegeben wurde
// wenn nicht wird die schleife immer wieder wiederholt
