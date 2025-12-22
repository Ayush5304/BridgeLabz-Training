import java.util.Scanner;

class FirstNonRepeatingCharacter{

    // Method to find first non-repeating character
    public static char findFirstNonRepeatingChar(String text) {

        // ASCII frequency array (256 characters)
        int[] freq = new int[256];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Find first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter the text");
        String text = sc.nextLine();

        // Find first non-repeating character
        char result = findFirstNonRepeatingChar(text);

        // Display result
        if (result != '\0'){
            System.out.println("First non-repeating character" + result);
        } else {
            System.out.println("No non-repeating character found");
        }
    }
}
