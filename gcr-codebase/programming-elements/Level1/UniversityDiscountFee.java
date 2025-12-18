import java.util.*;
// Program to calculate fee discount using user input
public class UniversityDiscountFee{
public static void main( String [] args){
    Scanner sc=new Scanner(System.in);
   //Create a variable named studentFee
    int studentFee=125000;     
   //and take user input for fee
    System.out.print("enter fee");  
   //Create another variablediscountPercent and take user input
    int discountPercent =10;  
   //Compute the discount and assign it to the discount variable
    int discount=studentFee*10/100;   
   // print the fee you have to pay by subtracting the discount from the fee//
    int finalFeePayment=studentFee-discount;   
   //output
     System.out.println("The discount amount is INR: " + discount+" and final discounted fee is INR: "+finalFeePayment);
}
}
