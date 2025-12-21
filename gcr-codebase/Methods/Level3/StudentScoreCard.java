import java.util.Scanner;

public class StudentScoreCard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students ");
        int n = sc.nextInt();

        // Generate random PCM scores
        int[][] pcmScores = generatePCMScores(n);

        // Calculate total, average, percentage
        double[][] results = calculateResults(pcmScores);

        // Display scorecard
        displayScoreCard(pcmScores, results);
    }

    // Method to generate random 2-digit PCM scores
    // Columns: 0 → Physics, 1 Chemistry, 2  Maths
    public static int[][] generatePCMScores(int n) {

        int[][] scores = new int[n][3];

        for (int i = 0; i < n; i++) {
            scores[i][0] = 10 + (int)(Math.random() * 90);
            scores[i][1] = 10 + (int)(Math.random() * 90);
            scores[i][2] = 10 + (int)(Math.random() * 90);
        }
        return scores;
    }

    // Method to calculate total, average and percentage
    // Columns 0 Total, 1  Average, 2  Percentage
    public static double[][] calculateResults(int[][] scores) {

        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 decimal places
            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // Method to display the scorecard
    public static void displayScoreCard(int[][] scores, double[][] result) {

        System.out.println("STUDENT SCORECARD");
        System.out.println("");
        System.out.println("Std\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t" +(int)result[i][0] + "\t" + result[i][1] + "\t" + result[i][2]);
        }
    }
}
