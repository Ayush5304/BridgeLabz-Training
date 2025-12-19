import java.util.Scanner;

// Program to calculate bonus and salary details of employees in Zara
public class ZaraEmployeeBonus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalEmployees = 10;

        // Arrays to store employee data
        double[] salary = new double[totalEmployees];
        double[] yearsOfService = new double[totalEmployees];
        double[] bonus = new double[totalEmployees];
        double[] newSalary = new double[totalEmployees];

        // Variables for totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        for (int i = 0; i < totalEmployees; i++) {

            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter Salary ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter Years of Service");
            yearsOfService[i] = sc.nextDouble();

            // Validate input
            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input! Please enter again");
                i--; 
                continue;
            }

            totalOldSalary += salary[i];
        }

        // Bonus calculation loop
        for (int i = 0; i < totalEmployees; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; 
            } else {
                bonus[i] = salary[i] * 0.02; 
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println(" Zara Company Bonus Summary");
        System.out.println("Total Old Salary of Employees " + totalOldSalary);
        System.out.println("Total Bonus Paid by Company " + totalBonus);
        System.out.println("Total New Salary of Employees" + totalNewSalary);
    }
}
