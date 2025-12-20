// a program to input the Principal, Rate, and Time values and calculate Simple Interest.

import java.util.Scanner;
public class SimpleInterest{

    // Method To to calculate simpleinterest
    public  int calculationSimpleInterest(int principle,int rate,int time) {
      int  simpleInterest = (principle * rate * time )/ 100;

        // return the simpleInterest
        return simpleInterest ;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for principle,rate, time
        System.out.print("Enter the principle: ");
        int principle = sc.nextInt();
		
		System.out.print("Enter the rate: ");
        int rate = sc.nextInt();
		
		System.out.print("Enter the time: ");
        int time = sc.nextInt();
		

        // Call the method 
      SimpleInterest SI = new  SimpleInterest();
     int simpleInt =  SI.calculationSimpleInterest(principle, rate, time);
      
        // Display value in simpleInt
        System.out.println("simple interest of given principle rate time is: " +  simpleInt);

       
    }
}
