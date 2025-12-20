// a program to find how many rounds must the athlete complete

import java.util.Scanner;
public class TotalRoundsOfPark{

    // Method To to calculate maximum round he can cover 
    public  int totalRoundsOfPark(int side1, int side2, int side3) {
      int perimter= (side1 +side2 +side3);
	  int totalRounds= perimter/5;

        // return the totalRounds
        return totalRounds;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for number
        System.out.print("side1: ");
        int side1 = sc.nextInt();
		
	 System.out.print("side2: ");
        int side2 = sc.nextInt();
		
		 System.out.print("side3: ");
        int side3 = sc.nextInt();

        // Call the method 
     TotalRoundsOfPark TR= new TotalRoundsOfPark ();
	 // create an object to call method
     int roundsOfPark =  TR.totalRoundsOfPark(side1, side2, side3 );
      
        // Display value in roundsofpark
        System.out.println(" the number of rounds user needs to do to complete 5km run: " +   roundsOfPark );

    }
}
