package Mehrdimensionale_Arrays_Collections_und_Maps.Auftrag.arraylist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class IntArrayListTest {
    private IntArrayList testee;

    @BeforeEach
    void setUp() {
        testee = new IntArrayList();
    }

    @Test
    void when_11_numbers_added_then_no_exception_occurs() {
        for (int i = 1; i <= 11; i++) {
            testee.add(i);
        }
    }

    @Test
    void get_when_number_5_at_position_5_then_result_is_5() {
        setupWithDefaultTestData();
        int actual = testee.get(5);
        assertEquals(6, actual);
    }

    @Test
    void size_when_11_numbers_added_then_size_is_11() {
        setupWithDefaultTestData();
        int actual = testee.size();
        assertEquals(11, actual);
    }

    @Test
    void contains_when_numbers_is_in_list_then_return_true() {
        setupWithDefaultTestData();
        assertTrue( testee.contains(2));
    }

    @Test
    void contains_when_numbers_is_not_in_list_then_return_false() {
        setupWithDefaultTestData();
        assertFalse( testee.contains(20));
    }

    private void setupWithDefaultTestData(){
        for (int i = 1; i <= 11; i++) {
            testee.add(i);
        }
    }

}
