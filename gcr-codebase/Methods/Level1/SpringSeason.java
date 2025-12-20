//a program SpringSeason that takes two int values month and day

import java.util.Scanner;
public class SpringSeason {

    // Method To to find whether season is spring or not
    public int springOrNot(int month, int day) {
     if((month==3 )&& (day>=20 && day<=31 )){
	 return 1;
	 }
	     if(month==4){
	 return 1;
		 }
	  if(month==5 ){
	 return 1;
	  }
	 if((month==6) && (day<=20)){
	
	 return 1;
	}
	 return -1;
	 }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
		
		// intialize month and day  as a command line inputs
		int month=Integer.parseInt(args[0]);
		int day=Integer.parseInt(args[0]);
        // Call the method 
    SpringSeason SS= new SpringSeason ();
	 // create an object to call method
     int springSeason = SS.springOrNot(month, day) ;
      
        // Display the which season
       
       if(springSeason==1){
			System.out.println("the month is spring season" );
		}
		if(springSeason==-1){
			System.out.println("the month is not spring season" );
		}
		
		}
    }

