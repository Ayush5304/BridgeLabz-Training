import java.util.Scanner;

class SplitTextComparison{

    // Method to find length of string without using length()
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

        // Step 1: Count number of words (spaces + 1)
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Step 2: Store space indexes
        int[] spaceIndexes = new int[wordCount + 1];
        int index = 0;
        spaceIndexes[index++] = -1; 

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = length; 

        // Step 3: Extract words using indexes
        String[] words = new String[wordCount];

        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                word = word + text.charAt(j);
            }
            words[i] = word;
        }

        return words;
    }

    // Method to compare two String arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take complete text input
        System.out.print("Enter the text");
        String text = sc.nextLine();

        // Split using user-defined method
        String[] manualSplit = splitTextUsingCharAt(text);

        // Split using built-in split() method
        String[] builtInSplit = text.split(" ");

        // Compare both results
        boolean isSame = compareStringArrays(manualSplit, builtInSplit);

        // Display results
        System.out.println("Words using user-defined method");
        for (String word : manualSplit) {
            System.out.println(word);
        }

        System.out.println("Words using split() method");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("Are both results equal" + isSame);
    }
}
