import java.util.Scanner;

// Program to check if a number is natural and find sum of first N natural numbers
public class SumOfNNaturalNumbers {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // take user input 
        System.out.print("Enter a number ");
        int number = sc.nextInt();

        // Check if number is a natural number and sum of it 
        if (number > 0) {
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of first " + number + " natural numbers is " + sum);
        } else {
            System.out.println(number + " is not a natural number");
        }

        sc.close();
    }
}
