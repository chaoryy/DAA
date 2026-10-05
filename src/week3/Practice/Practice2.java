package week3.Practice;

public class Practice2 {
    public static int binarySearchInsertPosition(int[] arr, int left, int right, int target) {
        if (left > right) {
            return left;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearchInsertPosition(arr, mid + 1, right, target);
        } else {
            return binarySearchInsertPosition(arr, left, mid - 1, target);
        }
    }

}
