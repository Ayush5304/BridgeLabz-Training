package com.AssessmentProblems.AeroVigil;
import java.util.*;
public class UserInterface {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
   FlightUtil fu= new FlightUtil();
   try {
    System.out.print("Enter flight details");
    String flightDetail= sc.next();
    sc.nextLine();
    
     String[] result= flightDetail.split(":");
     String flightNumber= result[0];
     String flightName= result[1];
     int passengerCount= Integer.parseInt(result[2]);
     double currentFuelLevel= Double.parseDouble(result[3]);
     
     fu.validateFlightNumber(flightNumber);
     fu.validateFlightName( flightName);
     fu.validatePassengerCount( passengerCount, flightName);
      double answer= fu.calculateFuelToFillTank(flightName, currentFuelLevel);
      System.out.println("Fuel required to fill the tank: " + answer + " litres");
      
   }
   catch (InvalidFlightException e) {
	   e.printStackTrace();
   }  
	}
}
