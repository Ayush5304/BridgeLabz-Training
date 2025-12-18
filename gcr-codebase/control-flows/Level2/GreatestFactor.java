import java.util.Scanner;

// Program to find the greatest factor of a number besides itself
public class GreatestFactor {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer ");
        int number = sc.nextInt();

        // Check if number is valid
        if (number <= 1) {
            System.out.println("No greatest factor exists for the given number");
        } else {

            // Initialize greatestFactor to 1
            int greatestFactor = 1;

            // take for loop from down to 1
            for (int i = number - 1; i >= 1; i--) {

                // Check if number is perfectly divisible by i
                if (number % i == 0) {
                    greatestFactor = i;
                    break;   
                }
            }

            // Display the greatest factor
            System.out.println("Greatest factor of " + number + " besides itself is: " + greatestFactor);
        }

    }
}
