import java.util.Scanner;

class LowerCaseComparison{

    // Method to convert text to lowercase using charAt() and ASCII logic
    public static String convertToLowerUsingCharAt(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // If character is uppercase (A-Z)
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase using ASCII difference of 32
                ch = (char) (ch + 32);
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
        System.out.print("Enter the text");
        String text = sc.nextLine();

        // Convert text to lowercase using user-defined method
        String manualLower = convertToLowerUsingCharAt(text);

        // Convert text to lowercase using built-in method
        String builtInLower = text.toLowerCase();

        // Compare both lowercase strings
        boolean isSame = compareStringsUsingCharAt(manualLower, builtInLower);

        // Display results
        System.out.println("\nLowercase using charAt() " + manualLower);
        System.out.println("Lowercase using toLowerCase()" + builtInLower);
        System.out.println("Are both results equal" + isSame);
    }
}
