import java.util.Scanner;

class UpperCaseComparison{

    // Method to convert text to uppercase using charAt() and ASCII logic
    public static String convertToUpperUsingCharAt(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // If character is lowercase (a-z)
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase using ASCII difference of 32
                ch = (char) (ch - 32);
            }

            result = result + ch;
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {

        // If lengths are different, strings are not equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take complete text input from user
        System.out.print("Enter the text ");
        String text = sc.nextLine();

        // Convert text to uppercase using user-defined method
        String manualUpper = convertToUpperUsingCharAt(text);

        // Convert text to uppercase using built-in method
        String builtInUpper = text.toUpperCase();

        // Compare both uppercase strings
        boolean isSame = compareStringsUsingCharAt(manualUpper, builtInUpper);

        // Display results
        System.out.println("Uppercase using charAt() " + manualUpper);
        System.out.println("Uppercase using toUpperCase() " + builtInUpper);
        System.out.println("Are both results equal " + isSame);
    }
}
