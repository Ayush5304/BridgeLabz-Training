import java.util.Scanner;

// Program to find the factorial of a number using forloop
public class FactorialUsingForLoop{

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
            // Calculate factorial using for loop
            for (int i=1; i <= number; i++) {
                factorial = factorial * i;
            }
            System.out.println("The factorial of " + number + " is " + factorial);
        }
        sc.close();
    }
	}