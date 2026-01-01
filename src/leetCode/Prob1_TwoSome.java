package leetCode;

import java.util.Map;
import java.util.HashMap;

/**
 * Given an array of integers {@code nums} and an integer {@code target}, return indices of the two numbers such that they add up to {@code target}.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */
public class Prob1_TwoSome {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)) {
                return new int[]{map.get(difference), i};
            }
            map.put(nums[i], i);
        }
        //If no answer, return empty array
        return new int[]{};
    }
}
