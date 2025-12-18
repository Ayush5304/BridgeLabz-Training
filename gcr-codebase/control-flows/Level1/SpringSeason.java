import java.util.Scanner;
//a program to check whether a month is spring season or not 
public class SpringSeason{
 public static void main(String[] args) {
 
  // Create Scanner object to take input from user
 Scanner sc= new Scanner(System.in);
 
   // take user input 
     System.out.print("enter a month ");
     int month= sc.nextInt();
     System.out.print("enter a day ");
     int day= sc.nextInt();
	 
  //check conditions whether a month is spring season or not and print the output according to it
    if((month==3 && day>=20) || (month==4) || (month==5) || (month==6 && day<=20)){
    System.out.println("Its a Spring Season");
  }
    else {
    System.out.println("Its not a Spring Season");
  }
 
  sc.close();
  }
  }