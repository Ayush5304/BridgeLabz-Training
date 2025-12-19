import java.util.Scanner;

// Program to copy a 2D array into a 1D array
public class Copy2DTo1DArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number of rows and columns
        System.out.print("Enter number of rows ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns");
        int columns = sc.nextInt();

        // Create 2D array (matrix)
        int[][] matrix = new int[rows][columns];

        // Take input for 2D array
        System.out.println("Enter elements of the matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Create 1D array of size rows * columns
        int[] array = new int[rows * columns];
        int index = 0;

        // Copy elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        System.out.println("Elements in 1D array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
