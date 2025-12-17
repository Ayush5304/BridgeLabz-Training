import java.util.Scanner;

public class BasicCalculator {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input//
        System.out.print("Enter first number");
        double numberOne = sc.nextDouble();

        System.out.print("Enter second number");
        double numberTwo= sc.nextDouble();

        // Arithmetic operations on two input numbers//
        double addition = numberOne + numberTwo;
        double subtraction = numberOne - numberTwo;
        double multiplication = numberOne * numberTwo;
        double division = numberOne/ numberTwo;

        // Output//
        System.out.println(
            "The addition, subtraction, multiplication and division value of 2 numbers "
            + numberOne+ " and " + numberTwo + " is "
            + addition + ", " + subtraction + ", "
            + multiplication + ", and " + division );

        sc.close();
    }
}

 
