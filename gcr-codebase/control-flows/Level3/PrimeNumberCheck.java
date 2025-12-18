import java.util.Scanner;

// Program to check whether a number is prime or not
public class PrimeNumberCheck {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Prime numbers are greater than 1
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {

            // Assume number is prime
            boolean isPrime = true;

            // Loop from 2 to number - 1
            for (int i = 2; i < number; i++) {

                // If number is divisible by i, it is not prime
                if (number % i == 0) {
                    isPrime = false;
                  // Exit loop
				 break;
                }
            }
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

    }
}
