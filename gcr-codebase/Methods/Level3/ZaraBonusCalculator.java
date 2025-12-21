import java.util.Random;

public class ZaraBonusCalculator{

    static final int EMP_COUNT = 10;

    public static void main(String[] args) {

        // Step 1: Generate salary and years of service
        int[][] employeeData = generateSalaryAndService();

        // Step 2: Calculate bonus and new salary
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);

        // Step 3: Display table and totals
        displaySalaryDetails(employeeData, updatedData);
    }

    // Method to generate salary and years of service
    // Column 0 → Salary, Column 1 → Years of Service
    public static int[][] generateSalaryAndService() {

        Random rand = new Random();
        int[][] data = new int[EMP_COUNT][2];

        for (int i = 0; i < EMP_COUNT; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); 
            data[i][1] = rand.nextInt(11);          
        }
        return data;
    }

    // Method to calculate bonus and new salary
    // Column 0 → Bonus, Column 1 → New Salary
    public static double[][] calculateBonusAndNewSalary(int[][] data) {

        double[][] updated = new double[EMP_COUNT][2];

        for (int i = 0; i < EMP_COUNT; i++) {
            int salary = data[i][0];
            int years = data[i][1];

            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            updated[i][0] = bonus;
            updated[i][1] = newSalary;
        }
        return updated;
    }

    // Method to display table and calculate totals
    public static void displaySalaryDetails(int[][] oldData, double[][] newData) {

        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.println("\nEmployee Salary Bonus Report (ZARA)");
        System.out.println("");
        System.out.printf("%-5s %-12s %-8s %-12s %-12s%n", "Emp", "OldSalary", "Years", "Bonus", "NewSalary");
        System.out.println("");

        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.printf("%-5d %-12d %-8d %-12.2f %-12.2f%n", (i + 1),oldData[i][0], oldData[i][1], newData[i][0],newData[i][1]);

            totalOldSalary += oldData[i][0];
            totalBonus += newData[i][0];
            totalNewSalary += newData[i][1];
        }

        System.out.println("");
        System.out.printf("%-5s %-12.2f %-8s %-12.2f %-12.2f%n", "TOTAL", totalOldSalary, "", totalBonus,totalNewSalary);
    }
}
