import java.util.Scanner;

class StringLengthWithoutLengthMethod{

    // Method to find length of string without using length()
    public static int findLengthWithoutLength(String text) {

        int count = 0;

        // Infinite loop
        while (true) {
            try {
                // Try to access each character
                text.charAt(count);
                count++; 
            }
            catch (StringIndexOutOfBoundsException e) {
                // Exception occurs when index goes out of bounds
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take string input from user
        System.out.print("Enter a text ");
        String text = sc.next();

        // Length using user-defined method
        int manualLength = findLengthWithoutLength(text);

        // Length using built-in method
        int builtInLength = text.length();

        // Display results
        System.out.println("Length without using length() " + manualLength);
        System.out.println("Length using built-in length() " + builtInLength);
    }
}
