import java.util.Scanner;

// Program to calculate percentage and grade using 2D array
public class StudentGradeUsing2DArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter number of students ");
        int n = sc.nextInt();

        // 2D array to store marks of Physics, Chemistry, Maths
        int[][] marks = new int[n][3];

        // Arrays to store percentage and grade
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Input marks
        for (int i = 0; i < n; i++) {

            System.out.println("Enter marks for Student " + (i + 1));

            System.out.print("Physics ");
            marks[i][0] = sc.nextInt();

            System.out.print("Chemistry ");
            marks[i][1] = sc.nextInt();

            System.out.print("Maths ");
            marks[i][2] = sc.nextInt();

            // Validation: marks must be positive
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks! Please enter positive values");
                i--; 
                continue;
            }

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // grade based on percentage
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }
        System.out.println("STUDENT RESULT ");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics " + marks[i][0]);
            System.out.println("Chemistry " + marks[i][1]);
            System.out.println("Maths " + marks[i][2]);
            System.out.println("Percentage " + percentage[i]);
            System.out.println("Grade " + grade[i]);
            System.out.println(" ");
        }
    }
}
