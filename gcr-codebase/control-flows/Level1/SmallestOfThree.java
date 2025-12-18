import java.util.Scanner;

public class SmallestOfThree {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Take three numbers as input
        System.out.print("Enter first number ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number ");
        int number2 = sc.nextInt();

        System.out.print("Enter third number ");
        int number3 = sc.nextInt();

        // Check if the first number is the smallest
        boolean isSmallest = (number1 < number2) && (number1 < number3);

        // Print the result that number 1 is smallest or not
        System.out.println("Is the first number the smallest? " + isSmallest);

        sc.close();
    }
}
