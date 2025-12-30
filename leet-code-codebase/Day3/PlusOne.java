import java.util.Arrays;

public class PlusOne{

    public static int[] plusOne(int[] digits) {

        // Traverse from last digit
        for (int i = digits.length - 1; i >= 0; i--) {

            // If digit is less than 9, just increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, make it 0 and continue carry
            digits[i] = 0;
        }

        // If all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1; 
        return result;
    }

    public static void main(String[] args) {

        int[] digits = {9, 9, 9};

        int[] result = plusOne(digits);

        System.out.println("Result after increment: " + Arrays.toString(result));
    }
}
