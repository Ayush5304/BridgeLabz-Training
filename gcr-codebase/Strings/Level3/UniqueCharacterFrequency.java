import java.util.Scanner;

class UniqueCharacterFrequency{

    // Method to find unique characters using nested loops
    public static char[] findUniqueCharacters(String text) {

        int length = text.length();
        char[] temp = new char[length];
        int uniqueCount = 0;

        // Outer loop to pick each character
        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // Inner loop to check previous characters
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Create array of exact size
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Method to find frequency using unique characters
    public static String[][] findCharacterFrequency(String text) {

        // ASCII frequency array
        int[] freq = new int[256];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Get unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Create 2D array [character][frequency]
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(freq[ch]);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter the text");
        String text = sc.nextLine();

        // Find frequency using unique characters
        String[][] frequencyData = findCharacterFrequency(text);

        // Display result
        System.out.println("Character\tFrequency");
        System.out.println("");

        for (int i = 0; i < frequencyData.length; i++) {
            System.out.println(frequencyData[i][0] + "\t\t" + frequencyData[i][1] );
        }
    }
}
