import java.util.*;
public class UniversityDiscountFee{
public static void main( String [] args){
   Scanner sc=new Scanner(System.in);
   int studentFee=125000;         //Create a variable named studentFee// 
   System.out.print("enter fee");    //and take user input for fee//
   int discountPercent =10;         //Create another variablediscountPercent and take user input//
   int discount=studentFee*10/100;   //Compute the discount and assign it to the discount variable//
    int finalFeePayment=studentFee-discount;   // print the fee you have to pay by subtracting the discount from the fee//
     System.out.println("The discount amount is INR: " + discount+" and final discounted fee is INR: "+finalFeePayment);
}
}