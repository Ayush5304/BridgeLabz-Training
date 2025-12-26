import java.util.Scanner;

public class MetroSmartCard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
// initial smart card balance
        int balance = 100; 

        while (balance > 0) {

            System.out.println("Current Balance: ₹" + balance);
            System.out.print("Enter distance in km (or -1 to quit)");
            int distance = sc.nextInt();

            // Exit condition
            if (distance == -1) {
                break;
            }

            // Calculate fare using ternary operator
            int fare = (distance <= 5) ? 10 : 20;

            // Check balance
            if (fare <= balance) {
                balance = balance - fare;
                System.out.println("Fare ₹" + fare + " deducted successfully");
            } else {
                System.out.println("Insufficient balance");
                break;
            }
        }

        System.out.println("Smart Card Session Ended");
        System.out.println("Remaining Balance ₹" + balance);
    }
}
