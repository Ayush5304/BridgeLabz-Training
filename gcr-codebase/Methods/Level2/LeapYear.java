import java.util.Scanner;

public class LeapYear{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a year");
        int year = sc.nextInt();

        // Check validation according to Gregorian calendar year
        if (year < 1582) {
            System.out.println("Leap year check is valid only for year >= 1582");
        } else {

         // Call method
          boolean result = isLeapYear(year);
            if (result) {
                System.out.println("Year"+year+" is a Leap Year");
            } else {
                System.out.println("Year" +year+" is NOT a Leap Year");
            }
        }
    }

    // Method to check leap year 
    public static boolean isLeapYear(int year) {

        boolean conditionA = (year % 4 == 0) && (year % 100 != 0);
        boolean conditionB = (year % 400 == 0);
        return conditionA || conditionB;
    }
}
