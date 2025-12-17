import java.util.Scanner;
// DoubleOpt program by taking double values //
public class DoubleOpt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Take the user Input//
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        // Double operations Compute 3 integer operations and assign the result to a variable//
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Output:print the result according to the operator precedence//
        System.out.println( "The results of Double Operations are " +result1 + ", " + result2 + ", " +      result3 + ", and " + result4);

        sc.close();
    }
}
