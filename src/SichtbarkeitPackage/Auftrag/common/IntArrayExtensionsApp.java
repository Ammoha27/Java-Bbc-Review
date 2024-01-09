package SichtbarkeitPackage.Auftrag.common;

import java.util.Arrays;

import static SichtbarkeitPackage.Auftrag.common.IntArrayExtensions.*;

public class IntArrayExtensionsApp {


    public static void main(String[] args) {

        int[] tenRandomNumber = IntArrayExtensions.getRandomNumbersInRange(10, 0, 9);
        System.out.println("Zufählige Zahlen: " + Arrays.toString(tenRandomNumber));
        System.out.println("Kleinster Wert: " + IntArrayExtensions.getMin(tenRandomNumber));
        System.out.println("Grösster Wert: " + IntArrayExtensions.getMax(tenRandomNumber));
        System.out.println("Durchschnitt: " + IntArrayExtensions.getAverage(tenRandomNumber));
        System.out.println("sortiert: " + Arrays.toString(sort(tenRandomNumber)));
        System.out.println("sortiert und rückwärts: " + Arrays.toString(IntArrayExtensions.reverse(sort(tenRandomNumber))));
        System.out.println("sortiert und gemischelt: " + Arrays.toString(mix(sort(tenRandomNumber))));
    }
}
