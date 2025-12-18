// Program to calculate discounted course fee
import java.util.*;
public class DiscountedCourseFee{
public static void main( String [] args){
  // Original fee and  Discount percentage
  int studentFee=125000;
  int discountPercent =10;
   // Discount calculation
  int discount=studentFee*10/100;
  int finalFeePayment=studentFee-discount;
  // Output
  System.out.println("The discount amount is INR: " + discount+" and final discounted fee is INR: "+finalFeePayment);
}
}
