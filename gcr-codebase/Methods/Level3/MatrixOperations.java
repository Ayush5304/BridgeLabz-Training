import java.util.Scanner;

public class MatrixOperations{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter number of rows ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns ");
        int cols = sc.nextInt();

        // Create two random matrices
        int[][] matrixA = createRandomMatrix(rows, cols);
        int[][] matrixB = createRandomMatrix(rows, cols);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);

        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);

        // Matrix Addition
        System.out.println("Matrix Addition (A + B)");
        displayMatrix(addMatrices(matrixA, matrixB));

        // Matrix Subtraction
        System.out.println("Matrix Subtraction (A - B)");
        displayMatrix(subtractMatrices(matrixA, matrixB));

        // For multiplication, columns of A must match rows of B
        System.out.println("Matrix Multiplication (A × B)");
        displayMatrix(multiplyMatrices(matrixA, matrixB));

        sc.close();
    }

    // a) Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10); 
            }
        }
        return matrix;
    }

    // b) Method to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // c) Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // d) Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {

        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Method to display matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
