package Source;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*The Two Sum problem involves finding two numbers in an array that add up to a given 
target number. Example Input: nums = [5, 2, 3], target = 8 Output: [0, 2]*/

public class TwoSum {
    public static void main (String [] args){
        int [] inputArray = {99, 88, 11, 77, 66, 55, 33, 22, 100};
        int target = 122;
        int [] output = twoSum (inputArray, target) ;
        System.out.println("Input : " + Arrays.toString(inputArray));
        System.out.println("Target :" + target);
        System.out.println("Output : " + Arrays.toString(output));
    }
    public static int [] twoSum (int[] inputArray01, int target01){
        Map <Integer, Integer> map = new HashMap<Integer, Integer>(); 
        for (int i=0; i<inputArray01.length; i++){
            if (map.containsKey(target01 - inputArray01[i])){
                return new int[] {map.get(target01 - inputArray01[i]), i};
            }
        map.put(inputArray01[i], i);
        System.out.println(map);
        }
           return new int[0];
    }
}
