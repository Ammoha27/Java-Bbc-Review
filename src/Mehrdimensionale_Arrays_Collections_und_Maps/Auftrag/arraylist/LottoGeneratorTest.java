package Mehrdimensionale_Arrays_Collections_und_Maps.Auftrag.arraylist;

import Mehrdimensionale_Arrays_Collections_und_Maps.Auftrag.arraylist.interfaces.IIntList;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertTrue;

public class LottoGeneratorTest {


    @Test
    void generateLottoNumbers_has_size_of_6() {
        boolean hasSizeOfSix = true;
        for (int i = 0; i < 10000000; i++) {
            IIntList lottoNumbers = LottoGenerator.generateLottoNumbers();
            if (lottoNumbers.size() != 6) {
                hasSizeOfSix = false;
            }
        }
        assertTrue(hasSizeOfSix);
    }


    @Test
    void generateLottoNumbers_all_numbers_are_between_1_and_42() {
        IIntList lottoNumbers = LottoGenerator.generateLottoNumbers();
        for (int i = 0; i < lottoNumbers.size(); i++) {
            assertTrue(lottoNumbers.get(i) > 0);
            assertTrue(lottoNumbers.get(i) <= 42);
        }

    }

    @Test
    void sameNumbers_when_generating_then_no_duplicates() {

        Set<Integer> uniqueNumbers;
        for (int i = 0; i < 10000000; i++) {
            IIntList lottoNumbers;
            lottoNumbers = LottoGenerator.generateLottoNumbers();
            uniqueNumbers = new HashSet<>();
            for (int j = 0; j < lottoNumbers.size(); j++) {
                assertTrue(!uniqueNumbers.contains(lottoNumbers.get(j)));
                uniqueNumbers.add(lottoNumbers.get(j));
            }
        }
    }
}
