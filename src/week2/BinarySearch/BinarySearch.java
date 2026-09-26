package week2.BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int i = Arrays.binarySearch(nums, target);
        return i >= 0 ? i : -1;
    }
}
