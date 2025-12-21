import java.util.Scanner;
import java.util.Arrays;

public class NumberChecker2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number ");
        int number = sc.nextInt();

        // Count digits
        int count = countDigits(number);
        System.out.println("Number of Digits" + count);

        // Store digits in array
        int[] digits = storeDigits(number, count);
        System.out.println("Digits Array " + Arrays.toString(digits));

        // Sum of digits
        int sumDigits = sumOfDigits(digits);
        System.out.println("Sum of Digits" + sumDigits);

        // Sum of squares of digits
        int sumSquares = sumOfSquares(digits);
        System.out.println("Sum of Squares of Digits " + sumSquares);

        // Harshad number check
        System.out.println("Is Harshad Number " + isHarshad(number, digits));

        // Frequency of digits
        System.out.println("Digit Frequency");
        int[][] frequency = digitFrequency(digits);
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] +  " occurs " + frequency[i][1] + " time(s)");
            }
        }
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

    // Method to find sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check Harshad number
    public static boolean isHarshad(int number, int[] digits) {
        return number % sumOfDigits(digits) == 0;
    }

    // Method to find frequency of digits using 2D array
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        // Initialize first column with digits 0–9
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }

        // Count frequency
        for (int d : digits) {
            freq[d][1]++;
        }

        return freq;
    }
}
