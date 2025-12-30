import java.util.Scanner;

public class TrainReservationQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int availableSeats = 5;   // Total seats
        int choice;

        System.out.println("Welcome to Train Reservation System");

        while (true) {

            System.out.println("\nMenu:");
            System.out.println("1. Book Ticket");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (availableSeats > 0) {
                        availableSeats--;
                        System.out.println(" Ticket booked successfully!");
                        System.out.println("Remaining Seats: " + availableSeats);
                    } else {
                        System.out.println(" No seats available!");
                        break;  
                    }
                    break;

                case 2:
                    System.out.println("Thank you for using the system");
                    return;   

                default:
                    System.out.println("Invalid choice Try again");
            }

            if (availableSeats == 0) {
                System.out.println(" All seats are booked Booking closed");
                break;
            }
        }
    }
}
