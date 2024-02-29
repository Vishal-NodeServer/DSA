public class QuickSort {
    // Function to partition the array and return the index of the pivot
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;  // Initialize empty index

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;  // Return pivot index
    }

    // Recursive function to perform quicksort
    public static void quiksort(int arr[], int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quiksort(arr, low, pivot - 1);    // Sort for elements smaller than the pivot
            quiksort(arr, pivot + 1, high);   // Sort for elements larger than the pivot
        }
    }

    public static void main(String args[]) {
        int[] arr = {6, 3, 9, 5, 3, 4};
        int n = arr.length;

        quiksort(arr, 0, n - 1);

        // Display the sorted array
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
