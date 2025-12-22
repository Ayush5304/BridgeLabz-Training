import java.util.Scanner;

class StudentScoreCard{

    // Method to generate random PCM marks (0–100)
    public static int[][] generatePCMMarks(int students) {

        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {
            marks[i][0] = (int) (Math.random() * 101); 
            marks[i][1] = (int) (Math.random() * 101); 
            marks[i][2] = (int) (Math.random() * 101); 
        }

        return marks;
    }

    // Method to calculate total, average, percentage
    public static double[][] calculateResults(int[][] marks) {

        double[][] results = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round off to 2 digits
            average = Math.round(average * 100) / 100.0;
            percentage = Math.round(percentage * 100) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    // Method to calculate grade based on percentage
    public static String[] calculateGrades(double[][] results) {

        String[] grades = new String[results.length];

        for (int i = 0; i < results.length; i++) {

            double percentage = results[i][2];

            if (percentage >= 80)
                grades[i] = "A";
            else if (percentage >= 70)
                grades[i] = "B";
            else if (percentage >= 60)
                grades[i] = "C";
            else if (percentage >= 50)
                grades[i] = "D";
            else if (percentage >= 40)
                grades[i] = "E";
            else
                grades[i] = "R";
        }

        return grades;
    }

    // Method to display scorecard
    public static void displayScoreCard(
            int[][] marks, double[][] results, String[] grades) {

        System.out.println( "Roll\tPhy\tChem\tMath\tTotal\tAverage\t%\tGrade");
        System.out.println( "");

        for (int i = 0; i < marks.length; i++) {
            System.out.println((i + 1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2] + "\t" +(int) results[i][0] + "\t" +results[i][1] + "\t" +results[i][2] + "\t" +grades[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number of students, Generate marks, Calculate total, average, percentage, Calculate grades,  Display scorecard
        System.out.print("Enter number of students");
        int students = sc.nextInt();

        int[][] marks = generatePCMMarks(students);
        double[][] results = calculateResults(marks);
        String[] grades = calculateGrades(results);
        displayScoreCard(marks, results, grades);
    }
}
