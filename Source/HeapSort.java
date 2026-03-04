package Source;
/**
 * Heap Sort Algorithm
 * Comparison-based sorting algorithm based on Binary Heap data structure
 * Time Complexity: O(n log n) in all cases
 * Space Complexity: O(1) - in-place sorting
 * Unstable sorting algorithm
 */
public class HeapSort {
    
    /**
     * Main method to perform heap sort
     * @param arr the array to be sorted
     */
    public static void heapSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        
        int n = arr.length;
        
        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        
        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root (maximum) to end
            swap(arr, 0, i);
            
            // Call heapify on reduced heap
            heapify(arr, i, 0);
        }
    }
    
    /**
     * Heapify a subtree rooted at index i
     * Maintains the max heap property
     * @param arr the array
     * @param n the size of the heap
     * @param i the index of the node to heapify
     */
    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;      // Left child
        int right = 2 * i + 2;     // Right child
        
        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        
        // If right child is larger than current largest
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        
        // If largest is not root, swap and recurse
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }
    
    /**
     * Swap two elements in an array
     * @param arr the array
     * @param i first index
     * @param j second index
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
    
    /**
     * Visualize the heap structure
     * @param arr the array representing the heap
     */
    public static void visualizeHeap(int[] arr) {
        System.out.println("Heap visualization (level-order):");
        int level = 0;
        int levelSize = 1;
        int index = 0;
        
        while (index < arr.length) {
            int count = 0;
            System.out.print("Level " + level + ": ");
            while (count < levelSize && index < arr.length) {
                System.out.print(arr[index] + " ");
                index++;
                count++;
            }
            System.out.println();
            level++;
            levelSize *= 2;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90, 88};
        
        System.out.println("Original array:");
        printArray(arr);
        
        System.out.println("\nHeap before sorting:");
        visualizeHeap(arr.clone());
        
        heapSort(arr);
        
        System.out.println("\nSorted array:");
        printArray(arr);
        
        // Test with another array
        System.out.println("\n--- Test 2 ---");
        int[] arr2 = {5, 2, 8, 1, 9};
        System.out.println("Original array:");
        printArray(arr2);
        
        heapSort(arr2);
        
        System.out.println("Sorted array:");
        printArray(arr2);
        
        // Test with edge cases
        System.out.println("\n--- Edge Cases ---");
        int[] arr3 = {1};
        System.out.println("Single element array:");
        heapSort(arr3);
        printArray(arr3);
        
        int[] arr4 = {3, 3, 3, 3};
        System.out.println("Array with duplicate elements:");
        heapSort(arr4);
        printArray(arr4);
    }
}
