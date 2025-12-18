import java.util.Scanner ;

// Program to check whether a year is a Leap Year or not
public class LeapYear{

    public static void main(String[] args) {
	// Create Scanner object
	   Scanner sc = new Scanner(System.in);
	    // Take user input as year
		System.out.print("Enter a year");
        int year = sc.nextInt();
		 if (year < 1582) {
            System.out.println("Leap Year calculation is valid only for year >= 1582");
        } 
		 else {

           //Using multiple if-else statements 
           System.out.println("Using multiple if-else");
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            } 
            else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year");
            } 
            else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year");
            } 
            else {
                System.out.println(year + " is not a Leap Year");
            }
			//Using single if with logical operators 
			  System.out.println("Using single if with logical operators");
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }
        }
}
}