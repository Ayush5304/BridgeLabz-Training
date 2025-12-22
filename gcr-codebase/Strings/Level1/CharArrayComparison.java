import java.util.Scanner;

class CharArrayComparison{

    // Method to return characters of a string without using toCharArray()
    public static char[] getCharsUsingCharAt(String text) {

        // Create char array of same length as string
        char[] chars = new char[text.length()];

        // Fill array using charAt()
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }

        return chars;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {

        // If lengths are different, arrays are not equal
        if (arr1.length != arr2.length) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true; 
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take string input from user
        System.out.print("Enter the text ");
        String text = sc.next();

        // Convert string to char array using user-defined method
        char[] userDefinedArray = getCharsUsingCharAt(text);

        // Convert string to char array using built-in method
        char[] builtInArray = text.toCharArray();

        // Compare both arrays
        boolean isSame = compareCharArrays(userDefinedArray, builtInArray);

        // Display characters from user-defined method
        System.out.print("Characters using user-defined method ");
        for (int i = 0; i < userDefinedArray.length; i++) {
            System.out.print(userDefinedArray[i] + " ");
        }

        // Display characters from built-in method
        System.out.print("Characters using toCharArray() ");
        for (int i = 0; i < builtInArray.length; i++) {
            System.out.print(builtInArray[i] + " ");
        }

        // Display comparison result
        System.out.println("Are both character arrays equal" + isSame);
    }
}
