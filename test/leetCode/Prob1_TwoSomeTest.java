package leetCode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Prob1_TwoSomeTest {
    private final Prob1_TwoSome solver = new Prob1_TwoSome();

    @Test
    void testBasicExample() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solver.twoSum(nums, target);

        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void testDifferentOrder() {
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] result = solver.twoSum(nums, target);

        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void testWithDuplicateValues() {
        int[] nums = {3, 3};
        int target = 6;

        int[] result = solver.twoSum(nums, target);

        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void testNegativeNumbers() {
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;

        int[] result = solver.twoSum(nums, target);

        assertArrayEquals(new int[]{2, 4}, result);
    }

    @Test
    void testZeroes() {
        int[] nums = {0, 4, 3, 0};
        int target = 0;

        int[] result = solver.twoSum(nums, target);

        assertArrayEquals(new int[]{0, 3}, result);
    }

    @Test
    void testNoSolutionReturnsEmptyArray() {
        int[] nums = {1, 2, 3};
        int target = 100;

        int[] result = solver.twoSum(nums, target);

        assertNotNull(result);
        assertEquals(0, result.length);
    }
}
