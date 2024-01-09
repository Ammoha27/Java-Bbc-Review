package Syntax.Auftrag;

public class Aufgabe4 {

    public static void main(String[] args) {

        for( int z = 1; z <= 10; z++) {

            System.out.print(z + " Reihe");
            for( int s = 1; s <= 10; s++)  {
                // Abstand
                if( z * s < 10) System.out.print( " ");
                if( z * s < 100) System.out.print( " ");

                System.out.print( "  " + z * s);
            }

            System.out.println();
        }
    }
}

