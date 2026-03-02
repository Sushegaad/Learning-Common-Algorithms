package Source;
/* Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.*/

public class LengthLastWord {
    public static void main (String [] args){
        String inputString = " We are the Champions  of the world ";
        inputString = inputString.trim();
        char [] charArray = inputString.toCharArray();
        int end = charArray.length; 
        int lengthOfLastWord = 0;

        for (int i = end-1; i>-1; i--){
            if (charArray[i] == ' '){
                    break;
            }
            lengthOfLastWord++;
        }
        System.out.println("Input : " + inputString);
        System.out.println("Output : " + lengthOfLastWord);
    }
}
