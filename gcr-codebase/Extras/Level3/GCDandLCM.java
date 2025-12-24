import java.util.Scanner;

public class GCDandLCM{

    // Method to take input
    public static int[] takeInput(Scanner sc) {

        int[] numbers = new int[2];

        System.out.print("Enter first number");
        numbers[0] = sc.nextInt();

        System.out.print("Enter second number");
        numbers[1] = sc.nextInt();

        return numbers;
    }

    // Method to calculate GCD using Euclidean algorithm
    public static int calculateGCD(int a, int b) {

        if (b == 0) {
            return a;
        }

        return calculateGCD(b, a % b);
    }

    // Method to calculate LCM
    public static int calculateLCM(int a, int b) {

        return (a * b) / calculateGCD(a, b);
    }

    // Method to display result
    public static void displayResult(int a, int b, int gcd, int lcm) {

        System.out.println("GCD of " + a + " and " + b + " is " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is " + lcm);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = takeInput(sc);

        int gcd = calculateGCD(nums[0], nums[1]);
        int lcm = calculateLCM(nums[0], nums[1]);

        displayResult(nums[0], nums[1], gcd, lcm);
    }
}
