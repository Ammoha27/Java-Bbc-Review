package Unittests.Auftrag;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntArrayExtensionsTest {
    int[] testData = new int[] {2,1,5,3};
    @Test
    void getMax() {


        // Act
        int actual = IntArrayExtensions.getMax(testData);

        // Assert
        assertEquals(5, actual);
    }


    @Test
    void getMin(){

        int actual = IntArrayExtensions.getMin(testData);
        assertEquals(1,actual);
    }


    @Test
    void getAverage(){
        double actual = IntArrayExtensions.getAverage(testData);
        assertEquals(2, actual);
    }



    @Test
    void getReverse(){
        int[] testdata = new int[]{4,3,2,1};
        int[] expected = new int[]{1,2,3,4};
        int[] actual = IntArrayExtensions.reverse(testdata);
        assertArrayEquals(expected, actual);
    }

    @Test
    void getSort(){
        int[] testdata = new int[]{1,3,4,2};
        int[] expected = new int[]{1,2,3,4};
        int[] actual = IntArrayExtensions.sort(testdata);
        assertArrayEquals(expected, actual);
    }
}

/* Aufbau
Jeder Unit-Test erstellt zuerst die Testdaten
ruft dann die Methode welche getestet werden soll mit den Testdaten auf
und vergleicht zum Schluss mittels einer Assert-Anweisung das erhaltene Resultat der zu testenden Methode mit dem effektiven Resultat
 */


/*
In meinem ursprünglichen Code war testData keine Instanz- oder Klassenvariable,
sondern eine lokale Variable innerhalb jeder Testmethode. Jede Testmethode hatte ihre eigene separate Deklaration und Initialisierung von testData, was zu einer Wiederholung von Code führte.
Als Instanzvariable, wird der Code sauberer und weniger redundant, da testData in jeder Testmethode wiederverwendet werden kann.
 */