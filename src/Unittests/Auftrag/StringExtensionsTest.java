package Unittests.Auftrag;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringExtensionsTest {

    @Test
    void reverse() {
        String testData = "Hello World";
        String expected = "dlroW olleH";
        String actual = StringExtensions.reverse(testData);
        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource({"0, 0", "12, 3", "0123, 6", "1000, 1" })
    void quersum(String testData, int result) {
        int actual = StringExtensions.quersum(testData);
        assertEquals(result, actual);
    }
}