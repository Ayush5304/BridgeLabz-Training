import java.util.Scanner;

// Program to find and store factors of a number
public class FactorsOfNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number ");
        int number = sc.nextInt();

        // Initial maximum size of factors array
        int maxFactor = 10;

        // Create factors array
        int[] factors = new int[maxFactor];

        // Index to track array position
        int index = 0;

        // Loop from 1 to number to find factors
        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                // If array is full, increase its size
                if (index == maxFactor) {

                    // Double the array size
                    maxFactor = maxFactor * 2;

                    // Create temporary array
                    int[] temp = new int[maxFactor];

                    // Copy old array elements to new array
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }

                    // Assign new array to factors
                    factors = temp;
                }

                // Store factor in array
                factors[index] = i;
                index++;
            }
        }

        System.out.println("Factors of " + number + " are");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
