package Mehrdimensionale_Arrays_Collections_und_Maps.Auftrag.arraylist;

import Mehrdimensionale_Arrays_Collections_und_Maps.Auftrag.arraylist.interfaces.IIntList;

public class IntArrayList implements IIntList {

    //  Das implements Schlüsselwort in public class IntArrayList implements IIntList bedeutet, dass die Klasse IntArrayList alle Methoden, die im Interface IIntList definiert sind, implementieren muss. Dies stellt sicher, dass Ihre Klasse ein bestimmtes Set von Funktionen bereitstellt und ermöglicht es Ihnen, IntArrayList in jedem Kontext zu verwenden, in dem IIntList benötigt wird.

    private static final int DEFAULT_ARRAY_SIZE = 10;
    private int[] numbers = new int[DEFAULT_ARRAY_SIZE];
    private int size = 0;

    public void add(int number) {
        if (size == numbers.length){
            grow();
        }
        numbers[size] = number;
        size++;
    }
    private void grow() {
        int[] newNumbers = new int[numbers.length + numbers.length / 2];
        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i];
        }
        numbers = newNumbers;
    }

        public int get(int index) {
               int number = numbers[index];
               return number;
        }

        public int size() {
        int size = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > 0){
                size++;
            }
        }
        return size;


        }
        public boolean contains(int number) {
            for (int i = 0; i < numbers.length; i++){
                if (numbers[i] == number){
                    return true;
                }
            }
            return false;
        }




    }
