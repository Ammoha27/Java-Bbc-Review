package Syntax.Auftrag;

import java.util.Arrays;

public class Aufgabe12 {
    public static void main(String[] args) {

        // Arrays bei Java beinhalten nur Werte eines Datentyps, die Länge des Arrays ist unveränderbar und muss beim Initialisieren gesetzt werden.
        //Du kannst ein Array als Liste von bestimmter Länge erstellen, oder das Array auch gleich mit konkreten Werten initialisieren.

        int[] meinArray = new int[3];
        meinArray = new int[]{1, 2, 3, 2, 3};
        for (int meinarr : meinArray) {
//            System.out.println(meinarr);
        }

        meinArray = new int[]{1, 2, 3};
        int[] zahlen = {10, 20, 13};

        String[] farben = {"Rot", "Grün", "Blau"};


        String[] students;
        students = new String[]{"hello", "Lol"};
        System.out.println(students);


        //Das Lesen und Schreiben bei Arrays erfolgt über den Index-Operator:
        int x = zahlen[0];        // x = 10
        zahlen[1] = 15;    // [10, 15, 13]

        x = zahlen.length;

        //Für das Durchlaufen (iterieren) durch Arrays, existiert eine spezielle for-Schlaufe.
        for (String farbe : farben) {
//            System.out.print(farbe);
        }


        // a)
        int[] numbers = new int[5];
        numbers = new int[]{0, 1, 2, 3, 4};
        for (int number : numbers) {
            System.out.println(number);
        }

        // b)
        int[] secondNumbers = new int[100];
        for (int i = 0; i < secondNumbers.length; i++){
            secondNumbers[i] = i; // für jeden index also für jede pos wird eine ahl gesetzt die erhöht wird mit jedem index
        }
        for (int s : secondNumbers){
            System.out.println(s);
        }

        // c)
        int summe = 0;
        for (int s : secondNumbers){
            summe += s;
        }
        System.out.println("Summe " + summe);



        // d)
        for (int s : secondNumbers){
            if (s % 2 == 0){
                s = s + 1;
                System.out.println(s);
            }
            else {
                s = s - 1;
                System.out.println(s);
            }
        }

        // Problem : Die for-each-Schleife arbeitet mit einer Kopie des Wertes jedes Elements des Arrays, nicht mit dem eigentlichen Element selbst. Das bedeutet, dass die Änderungen, die an s vorgenommen werden, nicht im ursprünglichen Array secondNumbers gespeichert werden.

        // Lösung : Alle Änderungen direkt im Array speichern

        for (int i = 0; i < secondNumbers.length; i++) { // die Schleife erreicht jedes Element des Arrays
            if (secondNumbers[i] % 2 == 0){
                secondNumbers[i] += 1; // mit [i] greifen wir an jedes einzelne Element zu. Von Schleifendurchgang für Schleifendurchgang
            }
            else {
                secondNumbers[i] -= 1;
            }
        }

        for (int s : secondNumbers) {
            System.out.println(s);
        }

    }
}
