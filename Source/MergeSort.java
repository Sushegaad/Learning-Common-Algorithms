package Source;
/**
 * Merge Sort Algorithm
 * Time Complexity: O(n log n) in all cases
 * Space Complexity: O(n)
 * Stable sorting algorithm that divides array into halves, sorts them recursively, and merges them back
 */
public class MergeSort {

    /**
     * Main method to perform merge sort
     * @param arr the array to be sorted
     */
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        mergeSortHelper(arr, 0, arr.length - 1);
    }

    /**
     * Helper method to recursively perform merge sort
     * @param arr the array to be sorted
     * @param left the left index
     * @param right the right index
     */
    private static void mergeSortHelper(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            
            // Sort left half
            mergeSortHelper(arr, left, mid);
            
            // Sort right half
            mergeSortHelper(arr, mid + 1, right);
            
            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    /**
     * Merge two sorted subarrays
     * @param arr the array containing the subarrays
     * @param left the left index
     * @param mid the middle index
     * @param right the right index
     */
    private static void merge(int[] arr, int left, int mid, int right) {
        // Create temporary arrays
        int leftSize = mid - left + 1;
        int rightSize = right - mid;
        
        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[rightSize];
        
        // Copy data to temporary arrays
        System.arraycopy(arr, left, leftArr, 0, leftSize);
        System.arraycopy(arr, mid + 1, rightArr, 0, rightSize);
        
        // Merge the temporary arrays back
        int i = 0, j = 0, k = left;
        
        while (i < leftSize && j < rightSize) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }
        
        // Copy remaining elements from left array
        while (i < leftSize) {
            arr[k++] = leftArr[i++];
        }
        
        // Copy remaining elements from right array
        while (j < rightSize) {
            arr[k++] = rightArr[j++];
        }
    }

    /**
     * Utility method to print array
     * @param arr the array to print
     */
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Original array:");
        printArray(arr);
        
        mergeSort(arr);
        
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
