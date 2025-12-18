import java.util.Scanner;

 //a program to print odd and even numbers between 1 to the number entered by the user.

public class EvenOrOdd{

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Take user input 
        System.out.print("Enter a number ");
        int number = sc.nextInt();
		if (number <= 0) {
            System.out.println("number is invalid");
        } else {
		 // check using for loop that number is even or odd
            for (int i=1; i <= number; i++) 
              if (i%2==0)  {
            System.out.println("The number" + i + " iseven" );
        }
		else {
		  System.out.println("The number is " + i  +" is odd ");
		}
        sc.close();
		}
    }
	}