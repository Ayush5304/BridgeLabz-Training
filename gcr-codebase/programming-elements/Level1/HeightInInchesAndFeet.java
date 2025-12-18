//program to convert height from cm to   inches and feet
import java.util.*;
public class HeightInInchesAndFeet{
public static void main( String [] args){
<<<<<<< HEAD
//take height in cm as input //
     Scanner sc=new Scanner(System.in);
     System.out.print("height in centimeters");  
//takes your height in centimeters and converts it into feet and inches : take:1 foot = 12 inches and 1 inch = 2.54 cm//
     double centimeters=sc.nextDouble();
     double InInches= centimeters/2.54;            
     int feet =(int)InInches/12;           
//print the height in cm to feet and inches//	 
     System.out.println( "Your Height in cm is:" + centimeters + "while in feet is :"+ feet+ "and inches is:" +InInches);
=======
    Scanner sc=new Scanner(System.in);
 // Height in centimeters
    System.out.print("height in centimeters");
    double centimeters=sc.nextDouble();
    double InInches= centimeters/2.54;
// Remaining inches
    int feet =(int)InInches/12;
// Output
    System.out.println( "Your Height in cm is:" + centimeters + "while in feet is :"+ feet+ "and inches is:" +InInches);
   }
>>>>>>> 6c5efba6d482941f6f6a1339b9c3cfa085c297ea
   }
