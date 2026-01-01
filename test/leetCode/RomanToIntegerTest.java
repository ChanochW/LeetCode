package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanToIntegerTest {
    private final RomanToInteger romanToInteger = new RomanToInteger();
    @Test
    void test() {
        assertEquals(3, romanToInteger.romanToInt("III"));
        assertEquals(58, romanToInteger.romanToInt("LVIII"));
        assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }

    @Test
    void test2() {
        assertEquals(3, romanToInteger.RomanToInt("III"));
        assertEquals(58, romanToInteger.RomanToInt("LVIII"));
        assertEquals(1994, romanToInteger.RomanToInt("MCMXCIV"));
    }
}
