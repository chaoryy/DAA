package week4.MergeSortLeetcodeTasks.SortAnArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] case1 = {5,2,3,1};
        int[] case2 = {5,1,1,2,0,0};

        System.out.println(Arrays.toString(case1));
        int[] sortedCase1 = solution.sortArray(case1);
        System.out.println(Arrays.toString(sortedCase1));
        System.out.println(Arrays.toString(case2));
        int[] sortedCase2 = solution.sortArray(case2);
        System.out.println(Arrays.toString(sortedCase2));
    }
}
