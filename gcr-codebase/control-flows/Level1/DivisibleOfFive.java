// program to check if a number is divisible by 5
import java.util.Scanner;
public class DivisibleOfFive {
    public static void main(String[] args) {
	
	// For taking user input Create a Scanner Object
	Scanner sc = new Scanner(System.in);
	 System.out.print("Enter the number ");
	  int number = sc.nextInt();
	  if(number%5==0)
	  
	  //Check if a number is divisble of 5 or not and print the output in "yes" or "no"
	  System.out.println(" the number" + number + "divisible by 5? " + "yes");
	  else
	  System.out.println(" the number" + number + "divisible by 5? " + "No");
	  sc.close();
	  }
	  }