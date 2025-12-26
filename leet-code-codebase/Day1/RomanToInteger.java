import java.util.Scanner;

public class RomanToInteger{

    // Method to convert Roman numeral to Integer
    public static int romanToInt(String s) {

        int total = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = valueOfRoman(s.charAt(i));

            // Check subtraction case
            if (i < s.length() - 1 && current < valueOfRoman(s.charAt(i + 1))) {
                total -= current;
            } else {
                total += current;
            }
        }

        return total;
    }

    // Method to get value of a Roman symbol
    public static int valueOfRoman(char ch) {
        if (ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        if (ch == 'M') return 1000;
        return 0;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Roman Numeral");
        String roman = sc.next().toUpperCase();

        int result = romanToInt(roman);

        System.out.println("Integer value is" + result);

    }
}
