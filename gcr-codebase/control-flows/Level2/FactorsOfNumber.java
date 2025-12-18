import java.util.Scanner;

// Program to find the factors of a number
public class FactorsOfNumber {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer");
        int number = sc.nextInt();

        // Check if the number is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {

            System.out.println("Factors of " + number + " are:");

            // Loop from 1 to less than number
            for (int i = 1; i < number; i++) {

                // Check if number is perfectly divisible by i
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }

        
        sc.close();
    }
}
