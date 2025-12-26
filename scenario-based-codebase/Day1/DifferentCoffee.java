//a Java program that asks the user for the coffee type using switch, accepts quantity, calculates 
//the total bill

import java.util.Scanner;
public class DifferentCoffee{

public static void main(String [] args){

   Scanner sc= new Scanner(System.in);
   final double GST_amount = 0.05; // 
   
   while(true){

  System.out.println("enter the coffee type or enter exit to stop");
	String coffeeType= sc.nextLine().toLowerCase();
	
   if(coffeeType.equals("exit")){
   System.out.println("thankyou for visiting the cafe");
   break;
   }
    System.out.println("enter the quantity");
	int quantity= sc.nextInt();
sc.nextLine();	
   
   double price=0.0;
   
  switch (coffeeType){
  case "latte" :
  price=2;
  break;
  
  case "coldCoffee" :
  price= 3;
 break;
  
  case "hotCoffee" :
  price= 4;
  break;
  
  default: 
  System.out.println("you have entered wrong coffee type");
  continue;
  } 
  double totalBill= price*quantity;
  double gstAmount=totalBill*GST_amount;
  double finalBill=gstAmount+totalBill;
  
  
  System.out.println("coffe type"+ coffeeType);
    System.out.println("coffee price"+ price);
	  System.out.println("coffe quantity"+ quantity);
	    System.out.println("coffe totalBill"+ totalBill);
		  System.out.println("coffe gstamount"+ gstAmount );
		   System.out.println("coffe finalBill"+ finalBill );
		   }
		   }
		   }