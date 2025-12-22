import java.util.Scanner;

class PalindromeCheck{

    //Compare characters from start and end (Iterative)
    public static boolean isPalindromeLogic1(String text){

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    //Recursive method
    public static boolean isPalindromeLogic2(String text, int start, int end) {
	
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindromeLogic2(text, start + 1, end - 1);
    }

    // method to reverse string using charAt()
    public static char[] reverseStringUsingCharAt(String text) {

        int length = text.length();
        char[] reverse = new char[length];

        for (int i = 0; i < length; i++){
            reverse[i] = text.charAt(length - 1 - i);
        }

        return reverse;
    }

    // Using character arrays
    public static boolean isPalindromeLogic3(String text) {

        char[] original = text.toCharArray();
        char[] reverse = reverseStringUsingCharAt(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter the text");
        String text = sc.nextLine();

        // Palindrome checks
        boolean result1 = isPalindromeLogic1(text);
        boolean result2 = isPalindromeLogic2(text, 0, text.length() - 1);
        boolean result3 = isPalindromeLogic3(text);

        // Display results
        System.out.println("Palindrome Check Results");
        System.out.println("Logic 1 (Iterative)" + result1);
        System.out.println("Logic 2 (Recursive)" + result2);
        System.out.println("Logic 3 (Char Array)" + result3);
    }
}
