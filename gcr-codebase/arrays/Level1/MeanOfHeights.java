import java.util.Scanner;

// a program to find the mean height of players present in a football team.
public class MeanOfHeights{

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);
		 // Define an integer array of size 11
		double [] heights =new double[11];
		double sumOfElements= 0.0;
		 // Take height input from the user
		 System.out.println("enter the heights of the players");
		 for(int i=0; i<11; i++){
		 heights[i]= sc.nextDouble();
		  sumOfElements+=heights[i];
		  }
		    // Calculate mean height
		double mean = sumOfElements / 11;
		System.out.println("the mean of the heights of the players are"+ mean);
		}
		}
		