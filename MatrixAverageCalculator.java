package com.alexomelchuk.lesson6ArrayAndMetod.lesson6HW;

import java.util.Random;
import java.util.Scanner;

public class MatrixAverageCalculator {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int row = s.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int column = s.nextInt();

        s.close();
        int matrix[][] = createMatrix(row, column);

        printMatrix(matrix);
        System.out.println("Average: " + avg(matrix));
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

    public static int avg(int[][] matrix) {
        int sumIndex = 0;
        int average = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[0].length; k++) {
                average += matrix[i][k];
                sumIndex++;

            }
        }

        return average / sumIndex;
    }
}

