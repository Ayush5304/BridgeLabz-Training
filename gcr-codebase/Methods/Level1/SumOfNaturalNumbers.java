// a program to find sum of n natural numbers

import java.util.Scanner;
public class SumOfNaturalNumbers{

    // Method To to calculate maximum round he can cover 
    public  int naturalNumbers(int number) {
    int sum=0;
	if(number>0){
	for(int i=0; i<number; i++)
	sum+=i;
	}
        // return the sum
        return sum;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for number
        System.out.print("enter the number: ");
        int number = sc.nextInt();
		

        // Call the method 
     SumOfNaturalNumbers Sum= new SumOfNaturalNumbers ();
	 // create an object to call method
     int naturalNumberSum =  Sum.naturalNumbers(number);
      
        // Display the sum of n natural numbers
        System.out.println(" the sum of n natural numbers: " +   naturalNumberSum );

    }
}
