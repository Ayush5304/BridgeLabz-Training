import java.util.Scanner;

// Program to print multiplication table of a number from 6 to 9
public class MultiplicationTableSixToNine {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Using for loop to print multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

       
        sc.close();
    }
}
