//a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user
import java.util.Scanner;

class EvenOrOddArray {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Take input for a number
      System.out.print("Enter a number ");
      int number = input.nextInt();

      // check for natural number
      if (number < 0) {
            System.err.println("Invalid Number");
            System.exit(0);
      }
     // Calculate array size
        int size = number / 2 + 1;

        // Create arrays for odd and even numbers
        int[] odd = new int[size];
        int[] even = new int[size];

        int oddIndex = 0;
        int evenIndex = 0;

        // Loop from 1 to number
        for (int i = 1; i <= number; i++) {

            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }
		// Print odd numbers
        System.out.println("Odd numbers");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        // Print even numbers
        System.out.println("Even numbers");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
    }
}