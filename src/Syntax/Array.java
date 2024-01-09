package Syntax;

public class Array {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4};
        for (int n : numbers){
            System.out.println(n);
        }

        String[] letters;
        letters = new String[] {"A"};


        int[] newNumbers = new int[]{1, 2, 3, 4};
        for (int i = 0; i < newNumbers.length; i++) {
            System.out.println(newNumbers[i]);
        }

    }
}
