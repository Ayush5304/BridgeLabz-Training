import java.util.Scanner;

public class PhoneRechargeSimulator{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 0;
        char choice;

        do {
            System.out.print("Enter Mobile Operator (Airtel/Jio/VI) ");
            String operator = sc.next();

            System.out.print("Enter Recharge Amount");
            double amount = sc.nextDouble();

            balance += amount;

            // switch for offers
            switch (operator.toLowerCase()) {
                case "airtel":
                    System.out.println("Offer: 1GB/day for 28 days");
                    break;

                case "jio":
                    System.out.println("Offer: Unlimited calls + 1.5GB/day");
                    break;

                case "vi":
                    System.out.println("Offer: Weekend data rollover");
                    break;

                default:
                    System.out.println("No offers available");
            }

            System.out.println("Current Balance: ₹" + balance);

            System.out.print("Do you want to recharge again? (Y/N)");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("Thank you for using Recharge Simulator");
    }
}
