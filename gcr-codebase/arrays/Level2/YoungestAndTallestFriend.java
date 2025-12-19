import java.util.Scanner;

// Program to find the youngest and tallest among three friends
public class YoungestAndTallestFriend {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array to store names of friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Arrays to store age and height
        int[] age = new int[3];
        double[] height = new double[3];

        // Take input for age and height
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i]);

            System.out.print("Enter age ");
            age[i] = sc.nextInt();

            System.out.print("Enter height (in cm)");
            height[i] = sc.nextDouble();
        }

        // Assume first friend is youngest and tallest initially
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Loop to find youngest and tallest
        for (int i = 1; i < 3; i++) {

            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }

            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }
        System.out.println("Result");
        System.out.println("Youngest friend is " + names[youngestIndex] +
                           " (Age " + age[youngestIndex] + ")");

        System.out.println("Tallest friend is " + names[tallestIndex] +
                           " (Height " + height[tallestIndex] + " cm)");

    }
}
