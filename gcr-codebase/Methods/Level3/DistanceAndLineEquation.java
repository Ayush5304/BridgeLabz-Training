import java.util.Scanner;
import java.util.Arrays;

public class DistanceAndLineEquation{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input for first point
        System.out.print("Enter x1 and y1 ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        // Input for second point
        System.out.print("Enter x2 and y2 ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Find Euclidean distance
        double distance = findEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance = " + distance);

        // Find equation of line
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);

        // Display slope and y-intercept
        System.out.println("Slope (m) = " + lineEquation[0]);
        System.out.println("Y-intercept (b) = " + lineEquation[1]);

        // Display equation of the line
        System.out.println("Equation of Line y = "  + lineEquation[0] + "x + " + lineEquation[1]);

    }

    // Method to find Euclidean distance
    public static double findEuclideanDistance(double x1, double y1, double x2, double y2) {

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find slope and y-intercept
    // Returns array → [slope, y-intercept]
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {

        double[] result = new double[2];

        // Calculate slope (m),  Calculate y-intercept (b)
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;

        result[0] = m;
        result[1] = b;

        return result;
    }
}
