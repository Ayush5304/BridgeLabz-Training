import java.util.Scanner;

class TrimStringUsingCharAt{

    // Method to find start and end index after trimming spaces
    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1}; 
    }

    // Method to create substring using charAt()
    public static String createSubstringUsingCharAt(String text, int start, int end) {

        String result = "";

        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input text
        System.out.print("Enter the text with spaces");
        String text = sc.nextLine();

        // Find trim indexes
        int[] indexes = findTrimIndexes(text);

        // Create trimmed string manually
        String manualTrim = createSubstringUsingCharAt(text, indexes[0], indexes[1]);

        // Built-in trim()
        String builtInTrim = text.trim();

        // Compare both strings
        boolean isSame = compareStringsUsingCharAt(manualTrim, builtInTrim);

        // Display result
        System.out.println("Manual Trim Result [" + manualTrim + "]");
        System.out.println("Built-in trim() Result[" + builtInTrim + "]");
        System.out.println("Are both results equal " + isSame);
    }
}
