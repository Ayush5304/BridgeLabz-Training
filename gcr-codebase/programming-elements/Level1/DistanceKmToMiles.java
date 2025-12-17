import java.util.*;
public class DistanceKmToMiles{
public static void main( String [] args){
//Create Scanner Object to take user input//
Scanner sc=new Scanner(System.in);
//Created a variable km and assign type as double//
System.out.print("enter km" );
double kilometers=sc.nextDouble();

//kilometeres in terms of miles//
double miles=kilometers*1.6;//Use 1 km= 1.6 miles//
System.out.println("The total miles is: " + miles+"  mile for the given"+ kilometers+" km");
}
}