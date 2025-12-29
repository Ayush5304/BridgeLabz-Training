import java.util.Scanner;

public class ShopkeeperDiscountDashboard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        double total = 0;
        int items = 5; 

        // Input item prices
        for (int i = 1; i <= items; i++) {
            System.out.print("Enter price of item " + i);
            total += sc.nextDouble();
        }

        // Apply discount
        if (total >= 500 && total < 1000) {
            total = total - (total * DISCOUNT_10);
            System.out.println("10% Discount Applied");
        } 
        else if (total >= 1000) {
            total = total - (total * DISCOUNT_20);
            System.out.println("20% Discount Applied");
        } 
        else {
            System.out.println("No Discount Applied");
        }

        System.out.println("Final Bill Amount" + total);
    }
}
