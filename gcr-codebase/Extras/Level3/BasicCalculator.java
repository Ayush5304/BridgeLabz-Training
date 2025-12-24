import java.util.Scanner;

public class BasicCalculator{

    // Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Basic Calculator");
        System.out.println(" Addition");
        System.out.println(" Subtraction");
        System.out.println(" Multiplication");
        System.out.println("Division");
        System.out.print("Choose an operation");
        int choice = sc.nextInt();

        System.out.print("Enter first number");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number");
        double num2 = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Result" + add(num1, num2));
                break;
            case 2:
                System.out.println("Result" + subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result" + multiply(num1, num2));
                break;
            case 4:
                System.out.println("Result" + divide(num1, num2));
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
