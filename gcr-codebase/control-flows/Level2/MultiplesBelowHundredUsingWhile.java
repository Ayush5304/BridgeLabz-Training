import java.util.Scanner;

// Program to find all multiples of a number below 100 using while loop
public class MultiplesBelowHundredUsingWhile {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer less than 100 ");
        int number = sc.nextInt();

        // Check if number is valid
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100");
        } else {

            System.out.println("Multiples of " + number + " below 100 are");

            // Counter starts from 100
            int counter = 100;

            // While loop till counter is greater than 1
            while (counter > 1) {

              // Check if counter is a multiple of number
                if (counter % number == 0) {
                    System.out.println(counter);
                }

                counter--; 
            }
        }
    }
}
