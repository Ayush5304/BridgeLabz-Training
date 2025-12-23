import java.util.Scanner;

public class PrimeNumberChecker{

    // Method to check if a number is prime
    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number");
        int number = sc.nextInt();

        // Check prime
        if (isPrime(number)) {
            System.out.println(number + " is a PRIME number");
        } else {
            System.out.println(number + " is NOT a prime number");
        }
    }
}
