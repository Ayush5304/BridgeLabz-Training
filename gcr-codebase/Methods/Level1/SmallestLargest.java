// Program to find the smallest and largest of three numbers

import java.util.Scanner;

public class SmallestLargest {

    //  method to find smallest and largest
    public static void findSmallestAndLargest(int a, int b, int c) {

        int smallest = a;
        int largest = a;

        // Check for smallest, largest  numbers
        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }
        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }

        // Print result
        System.out.println("Smallest number is " +smallest);
        System.out.println("Largest number is " +largest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        // Call the method
        findSmallestAndLargest(num1, num2, num3);

    }
}
