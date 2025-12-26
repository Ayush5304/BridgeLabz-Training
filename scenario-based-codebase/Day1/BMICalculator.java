// a Java program that takes height and weight as input, calculates BMI 	
 
 import java.util.Scanner;
 public class BMICalculator{
 public static double bmiOfPersons(double height, double weight){
    double BMI=weight / (height * height);
	
	return BMI;
 }
 
 public static void main (String[] args){
	 Scanner sc=new Scanner(System.in);
      System.out.println("enter the height in meters");
	     double height= sc.nextDouble();
	  
	  System.out.println("enter the weight");
	     double weight= sc.nextDouble();
		double BMI= bmiOfPersons(height,  weight);
		 	 
		 if(BMI<18.5){
		 System.out.println("he/she comes under"+ "underweight");
		 }
		 else if(BMI>=18.5 && BMI<=25){
		 System.out.println("he/she comes under"+ "normal");
		 }
	
		 else{
		 	 System.out.println("overweight");
			 }
			 }
			 }