package leetCode;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int size = 0;
        for (int c = 0; c < nums.length; c++) {
            if (nums[c] != val) {
                nums[size] = nums[c];
                size++;
            }
        }
        return size;
    }
}
