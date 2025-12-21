import java.util.Arrays;

public class FootballTeamHeight{

    public static void main(String[] args) {

        // Create an array to store heights of 11 players
        int[] heights = new int[11];

        // Generate random heights between 150 cm and 250 cm
        generateRandomHeights(heights);

        // Display all heights
        System.out.println("Heights of Football Team Players (in cm)");
        System.out.println(Arrays.toString(heights));

        // Calculate sum of heights, mean height, shortest height, tallest height
        int sum = findSum(heights);

        double mean = findMean(heights);

        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        // Display results
        System.out.println("Results:");
        System.out.println("Sum of Heights " + sum + " cm");
        System.out.println("Mean Height " + mean + " cm");
        System.out.println("Shortest Height " + shortest + " cm");
        System.out.println("Tallest Height " + tallest + " cm");
    }

    // Method to generate random heights between 150 and 250
    public static void generateRandomHeights(int[] heights) {
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }
    }

    // Method to find sum of all elements in the array
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }
}
