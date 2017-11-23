package com.alexomelchuk.lesson6ArrayAndMetod.lesson6HW;

import java.util.Random;
import java.util.Scanner;

public class MatrixMaxSumRowFinder {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int row = s.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int column = s.nextInt();

        s.close();
        int matrix[][] = createMatrix(row, column);

        printMatrix(matrix);
        System.out.println("Index: " + maxSumRowIndex(matrix));
    }

    public static int[][] createMatrix(int row, int column) {
        int[][] matrix = new int[row][column];

        if(row>0 || column>0){
            for (int r = 0; r < matrix.length; r++) {
                for (int c = 0; c < matrix[0].length; c++) {
                    matrix[r][c] = new Random().nextInt(100);
                }
            }

        }else if(row==0 && column ==0){
            throw new IllegalArgumentException("The Matrix is empty. Not entered rows and columns.");
        }else{
            throw new IllegalArgumentException("Incorrectly entered data");
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

    public static int maxSumRowIndex(int[][] matrix) {
        int sumRow = 0;
        int maxSumRow = 0;
        int index = 0;

        for (int i = 0; i < matrix.length; i++) {
            sumRow =0;
            for (int k = 0; k < matrix[0].length; k++) {
                sumRow += matrix[i][k];
            }
            if(maxSumRow<sumRow) {
                maxSumRow = sumRow;
                index = i;
            }

        }
        System.out.println(sumRow);

        return index;
    }
}


