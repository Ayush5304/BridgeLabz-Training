import java.util.Scanner;
import java.util.Arrays;

public class NumberChecker3{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number");
        int number = sc.nextInt();

        // Count digits
        int count = countDigits(number);
        System.out.println("Number of digits" + count);

        // Store digits in array
        int[] digits = storeDigits(number, count);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        // Reverse digits array
        int[] reversedDigits = reverseArray(digits);
        System.out.println("Reversed Digits Array" + Arrays.toString(reversedDigits));

        // Compare arrays
        System.out.println("Are both arrays equal? " + compareArrays(digits, reversedDigits));

        // Palindrome check,  Duck number check
        System.out.println("Is Palindrome Number? " + isPalindrome(digits, reversedDigits));
 System.out.println("Is Duck Number? " + isDuckNumber(digits));

    }

    // Method to count digits in a number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store digits in array
    public static int[] storeDigits(int number, int count) {
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to reverse digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    // Method to check palindrome number
    public static boolean isPalindrome(int[] original, int[] reversed) {
        return compareArrays(original, reversed);
    }

    // Method to check Duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }
}
