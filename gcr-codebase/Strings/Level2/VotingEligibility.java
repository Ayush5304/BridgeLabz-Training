import java.util.Scanner;
import java.util.Random;

class VotingEligibility{

    // Method to generate random 2-digit ages for n students
    public static int[] generateRandomAges(int n){

        int[] ages = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            // Generate random 2-digit age (10 to 99)
            ages[i] = rand.nextInt(90) + 10;
        }

        return ages;
    }

    // Method to check voting eligibility and return 2D String array
    public static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]); 

            // Validate age
            if (ages[i] < 0) {
                result[i][1] = "false"; 
            } 
            else if (ages[i] >= 18) {
                result[i][1] = "true";  
            } 
            else {
                result[i][1] = "false"; 
            }
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayResult(String[][] data) {

        System.out.println("Age\tCan Vote");
        System.out.println("");

        for (int i = 0; i < data.length; i++) {
            System.out.println(
                Integer.parseInt(data[i][0]) + "\t" + Boolean.parseBoolean(data[i][1])
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of students
        System.out.print("Enter number of students");
        int n = sc.nextInt();

        // Generate ages
        int[] ages = generateRandomAges(n);

        // Check voting eligibility
        String[][] votingResult = checkVotingEligibility(ages);

        // Display result
        displayResult(votingResult);
    }
}
