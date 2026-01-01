package leetCode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlusOneTest {

    private PlusOne plusOne = new PlusOne();
    @Test
    void testPlusOne() {
        int[] input = {1, 2, 3};
        int[] expectedOutput = {1, 2, 4};
        assertArrayEquals(expectedOutput, PlusOne.plusOne(input));

        int[] input3 = {9, 9, 9};
        int[] expectedOutput3 = {1, 0, 0, 0};
        assertArrayEquals(expectedOutput3, PlusOne.plusOne(input3));

        int[] input4 = {2, 5, 6, 9};
        int[] expectedOutput4 = {2, 5, 7, 0};
        assertArrayEquals(expectedOutput4, PlusOne.plusOne(input4));

        int[] input5 = {2, 9, 9, 9};
        int[] expectedOutput5 = {3, 0, 0, 0};
        assertArrayEquals(expectedOutput5, PlusOne.plusOne(input5));
    }

}