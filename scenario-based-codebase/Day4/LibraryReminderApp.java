import java.util.Scanner;

public class LibraryReminderApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int FINE_PER_DAY = 5;

        System.out.println(" Rohan's Library Fine Calculator");

        for (int bookNumber = 1; bookNumber <= 5; bookNumber++) {

            System.out.println("\nBook " + bookNumber);

            System.out.print("Enter Due Date (day number): ");
            int dueDate = scanner.nextInt();

            System.out.print("Enter Return Date (day number): ");
            int returnDate = scanner.nextInt();

            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                int fineAmount = lateDays * FINE_PER_DAY;
                System.out.println("Late by " + lateDays + " days");
                System.out.println(" Fine: ₹" + fineAmount);
            } else {
                System.out.println(" Book returned on time No fine");
            }
        }

        System.out.println("All books processed. Thank you!");
    }
}
