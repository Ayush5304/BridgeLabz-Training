import java.util.*;
//program to find distance in terms of yards and miles which is in inches//
public class DistanceInYardsAndMiles{
public static void main( String [] args){
//take distance in inches as input //
     Scanner sc=new Scanner(System.in);
     System.out.print("distance in inches");  
//takes your distance in inches and converts it into yards and miles : take:1 mile = 1760 yards and 1 yard is 3 feet//
     double distance=sc.nextDouble();
     double yards= distance/3;            
     int miles =(int)yards/1760;           
//print the distance in inches it into yards and miles//	 
     System.out.println( "Your distance in inches is:" + distance + "while in yards is :"+ yards+ "and in miles is:" + miles);
	 sc.close();
   }
   }