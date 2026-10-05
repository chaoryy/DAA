package week3.Practice;

public class Practice1 {
    public static void main(String[] args) {
        int[] arr = {3,7,12,18,23,27,31,35,39};
        int target = 35;
        findNumInArray(arr, target);
        int[] arr2 = {3,7,12,18,23,27,31,39};
        int result = Practice2.binarySearchInsertPosition(arr2, 0, arr.length -1, target);
        System.out.println("Practice 2: " + result);
    }

    public static void findNumInArray(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        String fmt = " left: %s \n right: %s \n mid: %s \n index: %s \n comparisons: %s \n";
        int comparisons = 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.printf(fmt, left, right, mid, arr[mid], comparisons);

            if (arr[mid] == target) {
                comparisons++;
                break;
            } else if (arr[mid] < target) {
                comparisons++;
                left = mid + 1;
            } else {
                comparisons++;
                right = mid - 1;
            }

        }

    }


}
