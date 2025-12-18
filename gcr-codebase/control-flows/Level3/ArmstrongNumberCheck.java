import java.util.Scanner;

// Program to check whether a number is an Armstrong number or not
public class ArmstrongNumberCheck {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Get integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize variables
        int originalNumber = number; 
        int sum = 0;                 

        // Loop until originalNumber becomes 0
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum = sum + (digit * digit * digit);
            originalNumber = originalNumber / 10;
        }

        // Check if number is Armstrong or not
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

    }
}
