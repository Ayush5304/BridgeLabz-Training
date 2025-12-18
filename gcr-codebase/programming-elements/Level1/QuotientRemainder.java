import java.util.Scanner;
//program to take 2 numbers and print their quotient and reminder
public class QuotientRemainder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user Input
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        // Calculation: Use-Use division operator (/) for quotient and moduli operator (%) for reminder//
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Output//
        System.out.println("The Quotient is " + quotient +" and Reminder is " + remainder +" of two number " + number1 +   " and " + number2);

        sc.close();
    }
}
