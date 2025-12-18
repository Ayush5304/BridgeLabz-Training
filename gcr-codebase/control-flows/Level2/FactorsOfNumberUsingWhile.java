import java.util.Scanner;

// Program to find the factors of a number using while loop
public class FactorsOfNumberUsingWhile {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer ");
        int number = sc.nextInt();

        // Check if the number is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer");
        } else {

            System.out.println("Factors of " + number + " are");

            // Counter variable
            int i = 1;

            // While loop runs till counter is less than the number
            while (i < number) {

                // Check if number is perfectly divisible by i
                if (number % i == 0) {
                    System.out.println(i);
                }

                i++; 
            }
        }

       
    }
}
