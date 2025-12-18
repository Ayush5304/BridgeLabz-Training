import java.util.Scanner;

// a program to find the sum of numbers until the user enters 0 or negative number
public class SumUntilZeroOrNegative {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Initialize total to 0.0
        double total = 0.0;

        // take infinite while loop 
        while (true) {

            System.out.print("Enter a number (0 or negative to stop): ");
            double number = sc.nextDouble();

            if (number <= 0) {
                break;
            }

            total += number;
        }
        System.out.println("The total sum is " + total);

        sc.close();
    }
}
