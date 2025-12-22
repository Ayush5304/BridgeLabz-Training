import java.util.Scanner;

class BMICalculator{

    // Method to calculate BMI and status of one person
    public static String[] calculateBMI(double weight, double heightCm) {

        double heightMeter = heightCm / 100.0;
        double bmi = weight / (heightMeter * heightMeter);

        // Round BMI to 2 decimal places
        bmi = Math.round(bmi * 100) / 100.0;

        String status;

        if (bmi <= 18.4)
            status = "Underweight";
        else if (bmi <= 24.9)
            status = "Normal";
        else if (bmi <= 39.9)
            status = "Overweight";
        else
            status = "Obese";

        return new String[]{
            String.valueOf(heightCm),
            String.valueOf(weight),
            String.valueOf(bmi),
            status
        };
    }

    // Method to compute BMI for all persons
    public static String[][] computeBMIForAll(double[][] data) {

        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            result[i] = calculateBMI(data[i][0], data[i][1]);
        }

        return result;
    }

    // Method to display BMI report in tabular format
    public static void displayBMIReport(String[][] bmiData) {

        System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println( "");

        for (int i = 0; i < bmiData.length; i++) {
            System.out.println( bmiData[i][0] + "\t\t" + bmiData[i][1] + "\t\t" +bmiData[i][2] + "\t\t" +bmiData[i][3]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 2D array to store weight and height
        double[][] inputData = new double[10][2];

        // Take input for 10 persons
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " +(i + 1));
            inputData[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " +(i + 1));
            inputData[i][1] = sc.nextDouble();
        }

        // Compute BMI and status
        String[][] bmiResult = computeBMIForAll(inputData);

        // Display result
        displayBMIReport(bmiResult);
    }
}
