package Syntax.Auftrag;

public class ArrayOptional {
    public static void main(String[] args) {

        // a)

        double[] numbers = new double[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = Math.floor(Math.random() * 100);
        }


        // c)

        double smallest = numbers[0];
        double largest = numbers[0];


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > smallest) {
                largest = numbers[i];
            } else if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("grösste Number ist : " + largest);
        System.out.println("kleinste Number ist : " + smallest);


        // d)

        double summe = 0;
        for (double n : numbers) {
            summe += n;
        }
        System.out.println("Summe " + summe);


        // e)


        double summe2 = 0;
        double durchschnitt = 0;

        for (double n : numbers) {
            summe2 += n;
        }
        durchschnitt = summe2 / numbers.length;
        System.out.println("Durchschnitt " + durchschnitt);


        // f) to be continued


            double[] newNumbers = new double[10];

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    newNumbers[i] = numbers[i];
                }

            }
            for (double n : newNumbers) {
                System.out.println(n);
            }

        }

    }

