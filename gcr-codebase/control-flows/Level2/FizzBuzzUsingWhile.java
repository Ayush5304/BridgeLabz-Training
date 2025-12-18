 import java.util.Scanner;

// Program to implement FizzBuzz using while loop
public class FizzBuzzUsingWhile{

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check for positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {

          int i = 1;

            // FizzBuzz logic using while loop
            while (i <= number) {

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }

                i++;
				}
				}
				}
}
				
				

				