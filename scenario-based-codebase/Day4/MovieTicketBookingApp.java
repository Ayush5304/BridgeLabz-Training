import java.util.Scanner;

public class MovieTicketBookingApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char continueBooking = 'y';

        System.out.println("Welcome to Movie Ticket Booking App");

        while (continueBooking == 'y' || continueBooking == 'Y') {

            System.out.println("\nSelect Movie Type:");
            System.out.println("1. Action");
            System.out.println("2. Comedy");
            System.out.println("3. Drama");
            System.out.print("Enter choice: ");
            int movieChoice = scanner.nextInt();

            int ticketPrice = 0;

            // switch for movie type
            switch (movieChoice) {
                case 1:
                    ticketPrice = 200;
                    break;
                case 2:
                    ticketPrice = 180;
                    break;
                case 3:
                    ticketPrice = 150;
                    break;
                default:
                    System.out.println("Invalid movie choice!");
                    continue;
            }

            // Seat type selection
            System.out.print("Choose Seat Type (Gold/Silver): ");
            String seatType = scanner.next();

            if (seatType.equalsIgnoreCase("Gold")) {
                ticketPrice += 100;
            } else if (seatType.equalsIgnoreCase("Silver")) {
                ticketPrice += 50;
            } else {
                System.out.println("Invalid seat type!");
                continue;
            }

            // Snacks selection
            System.out.print("Do you want snacks? (yes/no): ");
            String snacks = scanner.next();

            if (snacks.equalsIgnoreCase("yes")) {
                ticketPrice += 70;
            }

            System.out.println("Total Ticket Price: ₹" + ticketPrice);

            System.out.print("\nBook ticket for next customer? (y/n): ");
            continueBooking = scanner.next().charAt(0);
        }

        System.out.println("\nThank you for using Movie Ticket Booking App!");
    }
}
