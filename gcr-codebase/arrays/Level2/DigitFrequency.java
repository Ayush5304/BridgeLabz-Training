import java.util.Scanner;

// Program to find frequency of each digit in a number
public class DigitFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        //  count of digits
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

        // Frequency array for digits 0–9
        int[] frequency = new int[10];
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        System.out.println("Digit Frequency");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }
    }
}
