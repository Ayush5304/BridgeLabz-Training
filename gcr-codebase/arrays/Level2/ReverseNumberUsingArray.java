import java.util.Scanner;

// Program to reverse a number using arrays
public class ReverseNumberUsingArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        // Find number of digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        int[] digits = new int[count];

        // Store digits in array
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        // Array to store reversed digits
        int[] reverse = new int[count];

        // Copy digits into reverse array
        for (int i = 0; i < count; i++) {
            reverse[i] = digits[i];
        }
        System.out.print("Reversed number");
        for (int i = 0; i < count; i++) {
            System.out.print(reverse[i]);
        }
    }
}
