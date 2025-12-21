import java.util.Scanner;

public class MatrixAdvancedOperations{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input matrix size
        System.out.print("Enter rows ");
        int rows = sc.nextInt();

        System.out.print("Enter columns ");
        int cols = sc.nextInt();

        // Create random matrix
        double[][] matrix = createRandomMatrix(rows, cols);

        System.out.println("Original Matrix");
        displayMatrix(matrix);

        // Transpose
        System.out.println("Transpose Matrix");
        displayMatrix(transposeMatrix(matrix));

        // Determinant & Inverse only for square matrices
        if (rows == cols) {

            if (rows == 2) {
                double det = determinant2x2(matrix);
                System.out.println("Determinant (2x2) " + det);

                if (det != 0) {
                    System.out.println("Inverse (2x2)");
                    displayMatrix(inverse2x2(matrix));
                } else {
                    System.out.println("Inverse not possible (Determinant = 0)");
                }
            }

            if (rows == 3) {
                double det = determinant3x3(matrix);
                System.out.println("Determinant (3x3) " + det);

                if (det != 0) {
                    System.out.println("Inverse (3x3)");
                    displayMatrix(inverse3x3(matrix));
                } else {
                    System.out.println("Inverse not possible (Determinant = 0)");
                }
            }
        } else {
            System.out.println("Determinant & Inverse only for square matrices");
        }
    }

    //  Create random matrix
    public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 9) + 1;
            }
        }
        return matrix;
    }

    //  Transpose of matrix
    public static double[][] transposeMatrix(double[][] matrix) {
        double[][] transpose = new double[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Determinant of 2x2
    public static double determinant2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    // Determinant of 3x3
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1]) - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0]) + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // Inverse of 2x2
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);

        double[][] inverse = new double[2][2];
        inverse[0][0] =  m[1][1]; 
        inverse[0][1] = -m[0][1]; 
        inverse[1][0] = -m[1][0];
        inverse[1][1] =  m[0][0]; 

        return inverse;
    }

    // Inverse of 3x3
    public static double[][] inverse3x3(double[][] m) {

        double det = determinant3x3(m);
        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]); 
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) ;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) ;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]);
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) ;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) ;

        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) ;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) ;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) ;

        return inv;
    }

    // Display matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
    }
}
