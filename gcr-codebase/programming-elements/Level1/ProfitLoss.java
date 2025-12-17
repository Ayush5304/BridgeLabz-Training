// Program to calculate profit and profit percentage
import java.util.*;
public class ProfitLoss{
public static void main( String [] args){
    // Cost price and selling price
   double costPrice=129;
   double sellingPrice=191;
   double Profit=sellingPrice-costPrice;
   double profitPercentage = Profit / costPrice * 100;
     // Output using single print statement
    System.out.println("The Cost Price is INR 129 and Selling Price is INR 191"+
    "The Profit is INR :"+ Profit+" and the Profit Percentage is:" +profitPercentage);
}
}
