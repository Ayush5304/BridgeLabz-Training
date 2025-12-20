// a program to find the maximum number of handshakes among students

import java.util.Scanner;
public class TotalHandshakes{

    // Method To to calculate maximum no. of handshakesHandshakes
    public  int maximumHandshakes(int numberOfStudents ) {
      int handShakes =(numberOfStudents * (numberOfStudents - 1)) / 2;

        // return the handShakes
        return handShakes;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for number
        System.out.print("numberOfStudents: ");
        int numberOfStudents = sc.nextInt();
	

        // Call the method 
     TotalHandshakes HS = new TotalHandshakes ();
     int totalHanshakes =  HS.maximumHandshakes(numberOfStudents );
      
        // Display value in simpleInt
        System.out.println("maximum no. of handshakes by no.of students is: " +  totalHanshakes);

       
    }
}
