import java.util.Scanner;

public class MostFrequentCharacter{

    // Method to find most frequent character
    public static char findMostFrequentChar(String input) {

        int[] freq = new int[256]; 

        // Count frequency of each character
        for (int i = 0; i < input.length(); i++) {
            freq[input.charAt(i)]++;
        }

        int maxCount = 0;
        char result = ' ';

        // Find character with maximum frequency
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (freq[ch] > maxCount) {
                maxCount = freq[ch];
                result = ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string ");
        String input = sc.nextLine();

        // Call method
        char mostFrequent = findMostFrequentChar(input);

        // Display result
        System.out.println("Most Frequent Character'" + mostFrequent + "'");

        sc.close();
    }
}
