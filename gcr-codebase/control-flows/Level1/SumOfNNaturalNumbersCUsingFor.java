import java.util.Scanner;
import java.util.Scanner;
// Program to find the sum of n natural numbers using for loop
// and compare it with the formula n*(n+1)/2
public class SumOfNNaturalNumbersCUsingFor {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // take user input 
        System.out.print("Enter a number ");
        int number = sc.nextInt();

        // Check if number is a natural number and sum of it 
        if (number<= 0) {
            System.out.println("The entered number is not a natural number");
        }
  //  Using for loop 
            int sumUsingLoop = 0;

            for (int i = 1; i <= number; i++) {
                sumUsingLoop += i;
            }
            
   // Using formula 
            int sumUsingFormula = number * (number + 1) / 2;
   // Display both results
            System.out.println("Sum using for loop " + sumUsingLoop);
            System.out.println("Sum using formula " + sumUsingFormula);

    // Compare the results
            if (sumUsingLoop == sumUsingFormula) {
                System.out.println("Result is correct Both computations match.");
            } else {
                System.out.println("Result is incorrect Computations do not match.");
            }
        }


    
}