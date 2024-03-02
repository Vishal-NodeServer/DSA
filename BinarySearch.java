import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Return the index if found
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        } 

        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int targetValue = 3;
        Arrays.sort(array); // Binary search requires a sorted array
        int index = binarySearch(array, targetValue);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
