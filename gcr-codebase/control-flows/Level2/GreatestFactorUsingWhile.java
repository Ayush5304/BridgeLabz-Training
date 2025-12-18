import java.util.Scanner;

// Program to find the greatest factor of a number besides itself using while loop
public class GreatestFactorUsingWhile {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if number is valid
        if (number <= 1) {
            System.out.println("No greatest factor exists for the given number.");
        } else {

            // Initialize greatestFactor to 1
            int greatestFactor = 1;

            int counter = number - 1;

            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;   
                }

                counter--; 
            }
            System.out.println(  "Greatest factor of " + number + " besides itself is" + greatestFactor);
        }

       
    }
}
