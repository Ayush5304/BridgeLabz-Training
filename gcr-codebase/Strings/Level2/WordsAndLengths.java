import java.util.Scanner;

class WordsAndLengths{

    // Method to find length of a string without using length()
    public static int findLengthWithoutLength(String text) {
        int count = 0;

        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        return count;
    }

    // Method to split text into words using charAt()
    public static String[] splitTextUsingCharAt(String text) {

        int length = findLengthWithoutLength(text);

        // Step 1: Count words (spaces + 1)
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Step 2: Store space indexes
        int[] spaceIndexes = new int[wordCount + 1];
        int idx = 0;
        spaceIndexes[idx++] = -1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }
        spaceIndexes[idx] = length;

        // Step 3: Extract words
        String[] words = new String[wordCount];

        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = spaceIndexes[i] + 1; j<spaceIndexes[i + 1]; j++) {
                word = word + text.charAt(j);
            }
            words[i] = word;
        }

        return words;
    }

    // Method to create 2D array of word and its length
    public static String[][] createWordLengthArray(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int length = findLengthWithoutLength(words[i]);

            result[i][0] = words[i];
            result[i][1] = String.valueOf(length);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take complete text input
        System.out.print("Enter the text");
        String text = sc.nextLine();

        // Split text into words
        String[] words = splitTextUsingCharAt(text);

        // Create 2D array (word, length)
        String[][] wordLengthArray = createWordLengthArray(words);

        // Display result in tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println("");

        for (int i = 0; i < wordLengthArray.length; i++) {
            String word = wordLengthArray[i][0];
            int length = Integer.parseInt(wordLengthArray[i][1]);

            System.out.println(word + "\t\t" + length);
        }
    }
}
