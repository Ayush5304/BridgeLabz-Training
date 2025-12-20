//a program to find the youngest friends among 3 Amar, Akbar and Anthony 
import java.util.Scanner;

public class YoungestAndTallest{

    // Method to find the youngest of the 3 friends
    // Method to find the tallest of the 3 friends

     public static int youngestOfThreeFriends(int[] ages){
		 int youngest=ages[0];
		 for(int i=1; i<ages.length;i++){
			 if(ages[i]<youngest){
				 youngest=ages[i];
			 }
		 }
		 return  youngest;
	 }
	  public static int tallestOfThreeFriends(int[] heights){
		 int tallest=heights[0];
		 for(int i=1; i<heights.length;i++){
			 if(heights[i]>tallest){
				 tallest=heights[i];
			 }
		 }
		 return tallest;
	 }
		 
	


    public static void main(String[] args) {

		 
        Scanner sc = new Scanner(System.in);
         // Array to store ages of amar, akbar, anthony
        int[] ages = new int[3];
		int[] heights = new int[3];
		String[] names={"Amar", "Akbar", "Anthony"};
		
		//take inputs
		for(int i=0; i<3; i++){
			System.out.println("enter ages" + names[i]);
		    ages[i]=sc.nextInt();
		}
             	for(int i=0; i<3; i++){
			System.out.println("enter heights" + names[i]);
		    heights[i]=sc.nextInt();
		}    
       
	     int youngestAge = youngestOfThreeFriends(ages);
        int tallestHeight = tallestOfThreeFriends(heights);
		
		//display the outputs
		for(int i=0; i<3; i++){
			if(ages[i]== youngestAge){
			System.out.println("youngest age " + names[i]);
			}
		}
		for(int i=0; i<3; i++){
			if(heights[i]== tallestHeight)
			System.out.println("tallest height" + names[i]);
		}
	}
}
	
		
		