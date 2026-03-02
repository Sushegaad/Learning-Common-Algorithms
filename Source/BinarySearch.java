package Source;

/* Binary search is an efficient algorithm for finding an element in a sorted array. It works by repeatedly dividing the search interval in half until the target element is found or the interval becomes empty. 
*/

public class BinarySearch {
    public static void main(String[] args) {
        int[] intArray = {12, 22, 25, 33, 34, 45, 65, 76, 98, 98};
        int target = 34;
        int result = binarySearch(intArray, target);
        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
    public static int  binarySearch (int [] intArray, int target){
        int left = 0;
        int right = intArray.length -1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (intArray [mid] == target){
                return mid;
            }
            else if (intArray [mid] < target){
                left = mid + 1;
            }
            else {
                right = mid -1;
            }
        }
        return -1; // Target not found
    }
}
