package day4.level3;

import java.util.Random;
import java.util.Scanner;

public class Ques13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        
        int[][] matrix1 = randomMatrix(rows, cols);
        int[][] matrix2 = randomMatrix(rows, cols);
        
        int[][] sum = additionOfMatrix(matrix1, matrix2);
        int[][] diff = subtractionOfMatrix(matrix1, matrix2);
        int[][] product = productOfMatrix(matrix1, matrix2);
        int[][] transpose = transposeOfMatrix(matrix1);
        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        System.out.println("\nMatrix 2:");
        printMatrix(matrix2);
        System.out.println("\nSum of two matrices:");
        printMatrix(sum);
        System.out.println("\nDifference of two matrices:");
        printMatrix(diff);
        System.out.println("\nProduct of two matrices:");
        printMatrix(product);
        System.out.println("\nTranspose of Matrix 1:");
        printMatrix(transpose);
        if (rows == 2 && cols == 2) {
            int det = determinantOf2x2Matrix(matrix1);
            System.out.println("\nDeterminant of Matrix 1 (2x2): " + det);
            int[][] inverse = inverseOf2x2Matrix(matrix1);
            System.out.println("Inverse of Matrix 1 (2x2):");
            printMatrix(inverse);
        } else if (rows == 3 && cols == 3) {
            int det = determinantOf3x3Matrix(matrix1);
            System.out.println("\nDeterminant of Matrix 1 (3x3): " + det);
            int[][] inverse = inverseOf3x3Matrix(matrix1);
            System.out.println("Inverse of Matrix 1 (3x3):");
            printMatrix(inverse);
        }
    }

    public static int[][] randomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }

    public static int[][] additionOfMatrix(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.err.println("Matrices must have the same dimensions for addition.");
            return null;
        }
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractionOfMatrix(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.err.println("Matrices must have the same dimensions for subtraction.");
            return null;
        }
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] productOfMatrix(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            System.err.println("Number of columns in first matrix must equal number of rows in second matrix.");
            return null;
        }
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j]; 
                }
            }
        }
        return result;
    }

    public static int[][] transposeOfMatrix(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        if (matrix == null) return;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int determinantOf2x2Matrix(int[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) return 0;
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static int[][] inverseOf2x2Matrix(int[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) return null;
        int det = determinantOf2x2Matrix(matrix);
        if (det == 0) {
            System.err.println("Matrix is not invertible (determinant is 0)");
            return null;
        }
        int[][] inverse = new int[2][2];
        inverse[0][0] = matrix[1][1];
        inverse[0][1] = -matrix[0][1];
        inverse[1][0] = -matrix[1][0];
        inverse[1][1] = matrix[0][0];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                inverse[i][j] = inverse[i][j] / det;
            }
        }
        return inverse;
    }

    public static int determinantOf3x3Matrix(int[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) return 0;
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
             - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
             + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    public static int[][] inverseOf3x3Matrix(int[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) return null;
        int det = determinantOf3x3Matrix(matrix);
        if (det == 0) {
            System.err.println("Matrix is not invertible (determinant is 0)");
            return null;
        }
        int[][] inverse = new int[3][3];
        inverse[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]);
        inverse[0][1] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]);
        inverse[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]);
        inverse[1][0] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
        inverse[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]);
        inverse[1][2] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]);
        inverse[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        inverse[2][1] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]);
        inverse[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = inverse[i][j] / det;
            }
        }
        return inverse;
    }
}