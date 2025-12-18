import java.util.Scanner;

// a program to check if a number taken from the user is a Harshad Number
public class HarshadNumber{

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Get integer input
        System.out.print("Enter a number ");
        int number = sc.nextInt();

        // Initialize variables
        int originalNumber = number; 
        int sum = 0;                 

        // Loop until originalNumber becomes 0
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum = sum + digit;
            originalNumber = originalNumber / 10;
        }

        // Check if number is Harshad no. or not
        if (sum % number==0) {
            System.out.println(number + " is an HarshadNumber ");
        } else {
            System.out.println(number + " is not an HarshadNumber");
        }

    }
}