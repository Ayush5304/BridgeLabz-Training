import java.util.Scanner;

// Program to find the factorial of a number using while loop
public class FactorialUsingWhileLoop{

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Take user input 
        System.out.print("Enter a positive integer ");
        int number = sc.nextInt();
		if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else {
		 long factorial = 1;
            int i = 1;

            // Calculate factorial using while loop
            while (i <= number) {
                factorial = factorial * i;
                i++;
            }
            System.out.println("The factorial of " + number + " is " + factorial);
        }
        sc.close();
    }
	}
		