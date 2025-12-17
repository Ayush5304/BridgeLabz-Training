import java.util.*;
public class DiscountedCourseFee{
public static void main( String [] args){
int studentFee=125000;
int discountPercent =10;
int discount=studentFee*10/100;
int finalFeePayment=studentFee-discount;
System.out.println("The discount amount is INR: " + discount+" and final discounted fee is INR: "+finalFeePayment);
}
}