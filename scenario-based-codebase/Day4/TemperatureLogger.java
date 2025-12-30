import java.util.Scanner;

public class TemperatureLogger{

    // Method to read temperatures for 7 days
    public static double[] readTemperatures() {
        Scanner sc = new Scanner(System.in);
        double[] temperatures = new double[7];

        System.out.println("Enter temperatures for 7 days:");

        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temperatures[i] = sc.nextDouble();
        }
        return temperatures;
    }

    // Method to calculate average temperature
    public static double calculateAverage(double[] temperatures) {
        double sum = 0;

        for (double temp : temperatures) {
            sum += temp;
        }
        return sum / temperatures.length;
    }

    // Method to find maximum temperature
    public static double findMaxTemperature(double[] temperatures) {
        double maxTemp = temperatures[0];

        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > maxTemp) {
                maxTemp = temperatures[i];
            }
        }
        return maxTemp;
    }

    // Main method
    public static void main(String[] args) {

        double[] weeklyTemperatures = readTemperatures();

        double averageTemp = calculateAverage(weeklyTemperatures);
        double maxTemp = findMaxTemperature(weeklyTemperatures);

        System.out.println("\nTemperature Summary:");
        System.out.println("Average Temperature: " + averageTemp);
        System.out.println("Maximum Temperature: " + maxTemp);
    }
}
