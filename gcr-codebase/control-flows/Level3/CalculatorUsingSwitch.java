import java.util.Scanner;

// Program to create a calculator using switch-case
public class CalculatorUsingSwitch {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input values
        System.out.print("Enter first number");
        double first = sc.nextDouble();

        System.out.print("Enter second number ");
        double second = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /) ");
        String op = sc.next();

        double result;

        // Perform operation using switch-case
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result " + result);
                break;

            case "-":
                result = first - second;
                System.out.println("Result" + result);
                break;

            case "*":
                result = first * second;
                System.out.println("Result " + result);
                break;

            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result " + result);
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }

    }
}
