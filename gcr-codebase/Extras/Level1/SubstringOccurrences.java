import java.util.Scanner;

public class SubstringOccurrences{

    // Method to count occurrences of substring
    public static int countOccurrences(String mainStr, String subStr) {

        int count = 0;

        // Loop till last possible starting index
        for (int i = 0; i <= mainStr.length()-subStr.length(); i++) {

            // Check substring match
            if (mainStr.substring(i, i+  subStr.length()).equals(subStr)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take main string and substring input
        System.out.print("Enter the main string");
        String mainStr = sc.nextLine();
		
        System.out.print("Enter the substring");
        String subStr = sc.nextLine();

        // Call method
        int result = countOccurrences(mainStr, subStr);
        System.out.println("Substring occurs" +result+" times");
    }
}
