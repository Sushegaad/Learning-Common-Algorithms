package Source;
/* Bubble sort is a simple, iterative algorithm that sorts a list by repeatedly comparing adjacent elements and swapping them if they are in the wrong order. It "bubbles" the largest unsorted element to its correct position at the end of the list with each pass, typically requiring O(n^2) time complexity. */

import java.util.Arrays;

public class BubbleSort {
      public static void main (String [] args){
        int [] intArray = {98, 76, 45, 33, 22, 98, 65, 34, 25, 12};
        bubble_sort_function (intArray);
        System.out.println("Final:" + Arrays.toString(intArray));
    }
    public static void bubble_sort_function (int [] intArray01){
        int i, j;
        for (i=0; i < intArray01.length -1; i++){
              System.out.println("Iteration " + i + ": " + Arrays.toString(intArray01));
            for (j=0; j< intArray01.length -1 - i; j++){
                if (intArray01 [j] > intArray01 [j+1]){
                    int temp =  intArray01 [j+1];
                    intArray01 [j+1] = intArray01 [j];
                    intArray01 [j] = temp;
                }
             }
         }
        }
     }
