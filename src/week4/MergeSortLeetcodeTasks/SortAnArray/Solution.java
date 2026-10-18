package week4.MergeSortLeetcodeTasks.SortAnArray;

public class Solution {
    public int[] sortArray(int[] nums) {
        for (int j = 1; j < nums.length; j++ ) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i-1]) {
                    int tmp = nums[i];
                    nums[i] = nums[i-1];
                    nums[i-1] = tmp;
                }
            }
        }

        return nums;
    }
}
