// Program to find quotient and remainder of two numbers

import java.util.Scanner;

public class QuotientRemainder {

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;   
        int remainder = number % divisor;  

        // Store results in array
        return new int[] {quotient, remainder};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the number");
        int number = sc.nextInt();

        System.out.print("Enter the divisor ");
        int divisor = sc.nextInt();

        // Call method
        int[] result = findRemainderAndQuotient(number, divisor);

        System.out.println("Quotient is" + result[0]);
        System.out.println("Remainder is" + result[1]);
    }
}
