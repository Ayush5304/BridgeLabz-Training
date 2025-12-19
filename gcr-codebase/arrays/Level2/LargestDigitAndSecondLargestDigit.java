import java.util.Scanner;

// Program to store digits of a number and find largest & second largest digit
// with dynamic array resizing
public class LargestDigitAndSecondLargestDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number ");
        int number = sc.nextInt();
        int maxDigit = 10;

        // Array to store digits
        int[] digits = new int[maxDigit];
        int index = 0;

        // Loop until number becomes 0
        while (number != 0) {

            // If array is full, increase size by 10
            if (index == maxDigit) {
                maxDigit = maxDigit + 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < index; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        // Variables to store largest and second largest digits
        int largest = 0;
        int secondLargest = 0;

        // Find largest and second largest
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

    }
}
