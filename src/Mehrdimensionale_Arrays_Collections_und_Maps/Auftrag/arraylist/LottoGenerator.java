package Mehrdimensionale_Arrays_Collections_und_Maps.Auftrag.arraylist;

import Mehrdimensionale_Arrays_Collections_und_Maps.Auftrag.arraylist.IntArrayList;
import Mehrdimensionale_Arrays_Collections_und_Maps.Auftrag.arraylist.interfaces.IIntList;

import java.util.Random;

public class LottoGenerator {

    // Diese Methode generiert sechs einzigartige Lottozahlen zwischen 1 und 42
    public static IIntList generateLottoNumbers() {
        IIntList lottoNumbers = new IntArrayList();
        Random random = new Random();

        while (lottoNumbers.size() < 6) {
            int number = 1 + random.nextInt(42); // Zufallszahl zwischen 1 und 42
            if (!lottoNumbers.contains(number)) { // Überprüfung auf Einzigartigkeit
                lottoNumbers.add(number);
            }
        }
        return lottoNumbers;
    }
}


/*
IntArrayList implementiert das Interface IIntList.
Daher kann ein Objekt von IntArrayList als ein Objekt vom Typ IIntList behandelt werden.
lottoNumbers wird als ein IIntList behandelt, obwohl es tatsächlich ein Objekt von IntArrayList ist.
 */