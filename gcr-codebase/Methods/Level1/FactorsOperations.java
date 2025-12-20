import java.util.Scanner;

public class FactorsOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number");
        int number = sc.nextInt();
		
        int[] factors = findFactors(number);

        // Display factors
        System.out.println("Factors of " + number + " are");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        // Call methods 
        int sum = findSumOfFactors(factors);
        long product = findProductOfFactors(factors);
        double sumOfSquares = findSumOfSquaresOfFactors(factors);

        System.out.println("Sum of factors" + sum);
        System.out.println("Product of factors" + product);
        System.out.println("Sum of squares of factors" + sumOfSquares);
    }

    // Method to find factors and return them as an array
    public static int[] findFactors(int number) {

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create array with exact size
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    // Method to find sum of factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;

        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }

        return sum;
    }

    // Method to find product of factors
    public static long findProductOfFactors(int[] factors) {
        long product = 1;

        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }

        return product;
    }

    // Method to find sum of squares of factors
    public static double findSumOfSquaresOfFactors(int[] factors) {
        double sumOfSquares = 0;

        for (int i = 0; i < factors.length; i++) {
            sumOfSquares += Math.pow(factors[i], 2);
        }

        return sumOfSquares;
    }
}
