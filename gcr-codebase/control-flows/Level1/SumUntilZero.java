import java.util.Scanner;
// a program to find the sum of numbers until the user enters 0
public class SumUntilZero{
 public static void main(String[] args) {

 // Create Scanner object to take input from user
 Scanner sc=new Scanner(System.in);
 // Initialize total to 0.0
  double total=0.0;
  //take user input
     System.out.print("enter a number ");
	 double number=sc.nextDouble();
	 //take while loopuntil user enters 0
	 
	 while(number!=0){
	 total+=number;
	// Ask user to enter again
       System.out.print("Enter a number (0 to stop) ");
        number = sc.nextDouble();
        }

        // Display the total sum
        System.out.println("The total sum is" + total);

	 sc.close();
	 }
	 }