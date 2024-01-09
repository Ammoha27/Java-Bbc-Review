package Klassen.Auftrag;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class IntArrayExtensions {
    public static void main(String[] args) {
        int[] tenRandomNumber = getRandomNumbersInRange(10, 0, 9);

        System.out.println("Zufällige Zahlen: " + Arrays.toString(tenRandomNumber));
        System.out.println("Kleinster Wert: " + getMin(tenRandomNumber));
        System.out.println("Grösster Wert: " + getMax(tenRandomNumber));
        System.out.println("Durchschnitt: " + getAverage(tenRandomNumber));
        System.out.println("rückwärts: " + Arrays.toString(reverse(tenRandomNumber)));
        System.out.println("sortiert: " + Arrays.toString(sort(tenRandomNumber)));
        System.out.println("sortiert und rückwärts: " + Arrays.toString(reverse(sort(tenRandomNumber))));
        System.out.println("sortiert und wieder gemischt: " + Arrays.toString(mix(sort(tenRandomNumber))));
    }

    /**
     * Creates an array with random number.
     * @param size The size of the array.
     * @param min The smallest possible generated number.
     * @param max The biggest possible generated number.
     * @return the generated int array.
     */
    static int[] getRandomNumbersInRange(int size, int min, int max){
        Random random = new Random();
        return random.ints(size, min, max).toArray();
        // Array mit zufälligen Ganzzahlen, wobei size die Anzahl der Elemente im Array ist,
        // und die Zahlen im Bereich von min (inklusive) bis max (exklusive) liegen.
    }
    static int getMax(int[] array) {
       int Max = 0;
       for (int i = 0; i < array.length; i++){
           if (array[i] > Max){
                Max = array[i];
           }
       }
       return Max;
    }
    static int getMin(int[] array) {
        int lowest = 10;
        for (int i = 0; i < array.length; i++){
            if (array[i] < lowest){
                lowest = array[i];
            }
        }
        return lowest;
    }
    static double getAverage(int[] array) {
        int sum = 0;
        int average = 0;
        for (int A: array){
            sum += A;
           average = sum / array.length;
        }
        return average;
    }
    static int[] sort(int[] array) {
       int[] sorterArray = Arrays.copyOf(array, array.length);
       // mit copyof Kopieren wir das Array und die Länge, wir können die Länge auch selber bestimmen
       Arrays.sort(sorterArray);
       return sorterArray;
    }
    static int[] reverse(int[] array) {
        int length = array.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = array[length - 1 - i];
        }

        return reversedArray;
    }
    static int[] mix(int[] array) {
        return null;
    }
}
