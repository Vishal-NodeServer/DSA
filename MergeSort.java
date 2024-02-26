public class MergeSort {
    public static void conquer(int arr[], int mid, int ei, int si) {
        // Create an array to store the merged values
        int merged[] = new int[ei - si + 1];

        // Initialize indices and a counter variable
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        // Merge the subarrays in sorted order
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // Copy remaining elements from the first subarray
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // Copy remaining elements from the second subarray
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // Copy merged elements back to the original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int si, int ei) {
        // Base case: if the subarray has one or zero elements, it is already sorted
        if (si >= ei) { // either zero elements (empty) or one element.
            return;
        }

        // Calculate the midpoint of the array
        int mid = si + (ei - si) / 2;

        // Recursively divide the array into two halves
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);

        // Merge the two sorted halves
        conquer(arr, mid, ei, si);  // Corrected the order of parameters in conquer
    }

    public static void main(String args[]) {
        // Example array to be sorted
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        // Call the divide method to perform merge sort
        divide(arr, 0, n - 1);

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
