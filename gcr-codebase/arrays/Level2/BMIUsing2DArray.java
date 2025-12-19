import java.util.Scanner;

// Program to calculate BMI using 2D array
public class BMIUsing2DArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number of persons
        System.out.print("Enter number of persons");
        int number = sc.nextInt();

        // 2D array to store weight, height and BMI
        double[][] personData = new double[number][3];

        // Array to store weight status
        String[] weightStatus = new String[number];

        // Input loop for weight and height
        for (int i = 0; i < number; i++) {

            System.out.println("\nEnter details for Person " + (i + 1));

            // Take weight input
            do {
                System.out.print("Enter weight kg");
                personData[i][0] = sc.nextDouble();
            } while (personData[i][0] <= 0);

            // Take  height input
            do {
                System.out.print("Enter height meters ");
                personData[i][1] = sc.nextDouble();
            } while (personData[i][1] <= 0);
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < number; i++) {

            // BMI calculation
            personData[i][2] =
                    personData[i][0] /
                    (personData[i][1] * personData[i][1]);

            // weight status
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("BMI REPORT");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight " + personData[i][0] + " kg");
            System.out.println("Height " + personData[i][1] + " m");
            System.out.println("BMI" + personData[i][2]);
            System.out.println("Status " + weightStatus[i]);
            System.out.println(" ");
        }
    }
}
