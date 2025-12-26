import java.util.Scanner;

public class RajResultGenerator{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;

        // Input marks using for-loop
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject" + (i + 1));
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        // Calculate average
        int average = total / 5;
        char grade;

        // Assign grade using switch
        switch (average / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
            case 7:
                grade = 'B';
                break;
            case 6:
                grade = 'C';
                break;
            case 5:
            case 4:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }

        // Display result
        System.out.println("Result");
        System.out.println("Total Marks " + total);
        System.out.println("Average" + average);
        System.out.println("Grade" + grade);

    }
}
