package Source;
public class StringManipulations {
        public static void main(String[] args) {
        String input = "This string will be reversed.";
        stringReversal(input);
    }
    public static void stringReversal(String input) {
        String toBeReveresed = input;
        System.out.println ("Orginal String: " + toBeReveresed);
        char [] charArray = toBeReveresed.toCharArray();

        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray [left];
            charArray [left] = charArray [right];
            charArray [right] = temp;
            left = left +1;
            right = right -1;
        }
        System.out.println ("Reversed String: " + new String (charArray));
}
}
