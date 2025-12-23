import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take date input from user (YYYY-MM-DD format)
        System.out.print("Enter a date (YYYY-MM-DD)");
        String inputDate = sc.nextLine();

        // Convert string to LocalDate
        LocalDate date = LocalDate.parse(inputDate);

        // Add 7 days
        LocalDate after7Days = date.plusDays(7);

        // Add 1 month
        LocalDate after1Month = after7Days.plusMonths(1);

        // Add 2 years
        LocalDate after2Years = after1Month.plusYears(2);

        // Subtract 3 weeks
        LocalDate finalDate = after2Years.minusWeeks(3);

        // Display results
        System.out.println("\nOriginal Date" + date);
        System.out.println("After adding 7 days" + after7Days);
        System.out.println("After adding 1 month" + after1Month);
        System.out.println("After adding 2 years " + after2Years);
        System.out.println("After subtracting 3 weeks" + finalDate);

    }
}
