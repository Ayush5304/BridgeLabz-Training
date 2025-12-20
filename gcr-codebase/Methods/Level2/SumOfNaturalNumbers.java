// A program to find the sum of n natural numbers using recursion
// and compare it with the formula

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the number ");
        int number = sc.nextInt();

        // Call methods
        int sumUsingRecursion = sumOfNNaturalNumbers(number);
        int sumUsingFormula = sumUsingFormula(number);

        // Display results
        System.out.println("Sum of n natural numbers using recursion " + sumUsingRecursion);
        System.out.println("Sum of n natural numbers using formula" + sumUsingFormula);

        // Comparing  results
        if (sumUsingRecursion == sumUsingFormula) {
            System.out.println("Both results are equal");
        } else {
            System.out.println("Results are not equal");
        }
    }

    // Method to find sum using recursion
    public static int sumOfNNaturalNumbers(int number) {

        // Base condition
        if (number == 0) {
            return 0;
        }
        return number + sumOfNNaturalNumbers(number - 1);
    }

    // Method to find sum using formula
    public static int sumUsingFormula(int number) {

        int sum = number * (number + 1) / 2;
        return sum;
    }
}
