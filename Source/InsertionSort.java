package Source;

/* Insertion sort is a simple sorting algorithm that builds the final sorted array one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort. However, insertion sort provides several advantages: simple implementation, efficient for small data sets, adaptive for data sets that are already substantially sorted, stable (does not change the relative order of elements with equal keys), in-place (only requires a constant amount O(1) of additional memory space), and online (can sort a list as it receives it). 
*/
import java.util.Arrays;

public class InsertionSort {
    public static void main (String [] args){
        int [] integerArray = {98, 76, 45, 33, 22, 98, 65, 34, 25, 12};
        insertionSort (integerArray);
    }
    
    public static void insertionSort (int [] intArray){
        System.out.println("Input Array: " + Arrays.toString(intArray)); 
        
        for (int i = 1; i < intArray.length; i++){
            int	temp = intArray [i] ;
            int hole = i ; 
            while (hole > 0 &&  intArray [hole-1] > intArray [hole]) {
                intArray [hole] = intArray [hole -1];
                intArray [hole-1] = temp;
                hole--;
            }
        System.out.println ("Iteration " + i + ": " + Arrays.toString(intArray));
	}
}    
}
