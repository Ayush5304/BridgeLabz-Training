import java.util.Scanner;
// program for the maximum number of handshakes among N number of students//

public class HandshakeCalculator {
 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take integer input for numberOfStudents variable//
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculation: use- (n * (n - 1)) / 2 formula//
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Output
        System.out.println("The maximum number of possible handshakes is " + handshakes);

        sc.close();
    }
}
