//  a program to check whether a number is positive, negative, or zero

import java.util.Scanner;
public class PositveNegativeOrZero{

    // Method To to find whether the no. is positive, negative or zero
    public int natureOfNumber(int number) {
     if(number>0){
	    return 1;
		}
		 if(number<0){
	   return -1;
		}
		 
	  return 0;
		}
    

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for number
        System.out.print("number: ");
        int number= sc.nextInt();
	
		
		
        // Call the method 
     PositveNegativeOrZero PNZ = new PositveNegativeOrZero ();
	 // create an object to call method
     int numbersNature = PNZ.natureOfNumber( number) ;
      
        // Display nature of number
        System.out.println(" the number is: " +  numbersNature );
       if(numbersNature>0){
			System.out.println("the number is positive");
		}
		if(numbersNature<0){
			System.out.println("the number is negative");
		}
		if(numbersNature==0){
			System.out.println("the number is zero");
		}
    }
}
