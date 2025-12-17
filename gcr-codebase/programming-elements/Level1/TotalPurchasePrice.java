import java.util.Scanner;

public class TotalPurchasePrice {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input the unit price of an item and the quantity to be bought//
        System.out.print("Enter unit price ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter quantity ");
        int quantity = sc.nextInt();

        // Calculation total price of an item //
        double totalPrice = unitPrice * quantity;

        // Output
        System.out.println( "The total purchase price is INR " + totalPrice +
            " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        sc.close();
    }
}
