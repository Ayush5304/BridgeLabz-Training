import java.util.Scanner;

public class MaximumOfThree{

    // Method to take input from user
    public static int[] takeInput(Scanner sc) {
        int[] numbers = new int[3];

        System.out.print("Enter first number");
        numbers[0] = sc.nextInt();

        System.out.print("Enter second number");
        numbers[1] = sc.nextInt();

        System.out.print("Enter third number ");
        numbers[2] = sc.nextInt();

        return numbers;
    }

    // Method to find maximum of three numbers
    public static int findMaximum(int a, int b, int c) {

        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take inputs
        int[] nums = takeInput(sc);

        // Find maximum
        int maximum = findMaximum(nums[0], nums[1], nums[2]);
        // Display result
        System.out.println("Maximum of the three numbers is" + maximum);
    }
}
