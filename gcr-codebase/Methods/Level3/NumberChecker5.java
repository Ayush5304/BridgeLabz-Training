import java.util.Scanner;

public class NumberChecker5{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number ");
        int number = sc.nextInt();

        // Call utility methods
        System.out.println("Is Perfect Number " + isPerfect(number));
        System.out.println("Is Abundant Number " + isAbundant(number));
        System.out.println("Is Deficient Number " + isDeficient(number));
        System.out.println("Is Strong Number " + isStrong(number));
    }

    // Method to check Perfect number
    public static boolean isPerfect(int number) {
        int sum = 0;

        // Proper divisors are from 1 to number/2
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    // Method to check Abundant number
    public static boolean isAbundant(int number) {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum > number;
    }

    // Method to check Deficient number
    public static boolean isDeficient(int number) {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum < number;
    }

    // Method to check Strong number
    public static boolean isStrong(int number) {
        int temp = number;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // Method to calculate factorial of a digit
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
