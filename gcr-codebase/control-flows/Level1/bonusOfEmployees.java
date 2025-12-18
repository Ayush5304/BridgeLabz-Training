import java.util.Scanner;

// Program to find the bonus of employees based on their years of service
public class BonusOfEmployees {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Take user input for salary
        System.out.print("Enter salary ");
        int salary = sc.nextInt();

        // Take user input for years of service
        System.out.print("Enter years of service ");
        int yearsOfService = sc.nextInt();

        double bonus = 0.0;

        // Check eligibility for bonus
        if (yearsOfService > 5) {
            bonus = salary * 0.05;   // 5% bonus
            System.out.println("Bonus amount is " + bonus);
        } else {
            System.out.println("No bonus Years of service is less than or equal to 5");
        }

        sc.close();
    }
}
		
		
		
		
		