import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Take three numbers as input
        System.out.print("Enter first number ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number ");
        int number2 = sc.nextInt();

        System.out.print("Enter third number ");
        int number3 = sc.nextInt();

        // Check if the first number is the smallest
        if((number1 > number2) && (number1 > number3)){

        // Print the result that for number 1 
        System.out.println("the first number the largest? yes");
        System.out.println ( "Is the second number the largest? No");
		System.out.println  ("Is the third number the largest? No");
		}  
							   else if((number1 < number2) && (number2 > number3)){
        // Print the result that for number 2
        System.out.println ("the first number the largest? No");
        System.out.println("Is the second number the largest? Yes");
         System.out.println("Is the third number the largest? No");
							   }	   else{
 // Print the result that for number 3
        System.out.println("the first number the largest? No");
        System.out.println( "Is the second number the largest? No");
        System.out.println(  "Is the third number the largest? Yes");
							   }

        sc.close();
    }
}
