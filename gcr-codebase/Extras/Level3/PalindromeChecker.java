import java.util.Scanner;

public class PalindromeChecker{

    // Method to take input
    public static String takeInput(Scanner sc){
        System.out.print("Enter a string");
        return sc.nextLine();
    }

    // Method to check palindrome
    public static boolean isPalindrome(String input){

        input = input.toLowerCase();
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    // Method to display result
    public static void displayResult(boolean result){

        if (result) {
            System.out.println("The string is a PALINDROME");
        } else {
            System.out.println("The string is NOT a palindrome");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = takeInput(sc);
        boolean result = isPalindrome(input);
        displayResult(result);

    }
}
