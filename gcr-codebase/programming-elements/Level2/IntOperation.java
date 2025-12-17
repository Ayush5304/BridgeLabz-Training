import java.util.Scanner;
//IntOperation program by taking a, b, and c as input values//
public class IntOperation {
 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create variables a, b, and c of int data type//
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        // Integer operations: Compute 3 integer operations and assign the result to a variable//
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Output:  print the result according to the operator precedence//
        System.out.println( "The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        sc.close();
    }
}