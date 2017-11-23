package com.alexomelchuk.lesson6ArrayAndMetod.lesson6HW;

import java.util.Random;
import java.util.Scanner;

public class MatrixTransposer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int row = s.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int column = s.nextInt();
        int matrix[][] = createMatrix(row, column);

        s.close();

        System.out.println("The original matrix: ");
        printMatrix(matrix);
        System.out.println("The transpore matrix: ");
        printTransposeMatrix(matrix);

    }

    public static int[][] createMatrix(int row, int column) {
        int[][] matrix = new int[row][column];

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                matrix[r][c] = new Random().nextInt(100);

            }
        }
        return matrix;

    }

    public static void printMatrix(int[][] matrix) {

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                System.out.print(matrix[r][c] + "\t");
            }
            System.out.println();
        }
    }

    public static void printTransposeMatrix(int[][] matrix) {

        int [][] transposeMatrix = new int [matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int k = 0; k < matrix.length; k++) {
                int temp = transposeMatrix[i][k];
                transposeMatrix[i][k]= matrix[k][i];
                matrix [k][i] = temp;

            }
        }

        for (int i = 0; i < matrix[0].length; i++) {
            for (int k = 0; k < matrix.length; k++) {
                System.out.print(transposeMatrix[i][k] + "\t");
            }
            System.out.println();
        }
    }

}


