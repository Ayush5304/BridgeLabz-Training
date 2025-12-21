import java.util.Scanner;
import java.util.Arrays;

public class FactorsOperations{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number ");
        int number = sc.nextInt();

        // Find factors and store in array
        int[] factors = findFactors(number);

        // Display factors
        System.out.println("Factors of " + number   + Arrays.toString(factors));

        // Greatest factor
        System.out.println("Greatest Factor " + greatestFactor(factors));

        // Sum of factors
        System.out.println("Sum of Factors " + sumOfFactors(factors));

        // Product of factors
        System.out.println("Product of Factors " + productOfFactors(factors));

        // Product of cube of factors
        System.out.println("Product of Cube of Factors " +
                productOfCubeOfFactors(factors));
    }

    // Method to find factors of a number and return as array
    public static int[] findFactors(int number) {

        // First loop: count number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create array of required size
        int[] factors = new int[count];

        // Second loop: store factors in array
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find greatest factor
    public static int greatestFactor(int[] factors) {
        int max = factors[0];
        for (int factor : factors) {
            if (factor > max) {
                max = factor;
            }
        }
        return max;
    }

    // Method to find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find product of cube of factors
    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
}
