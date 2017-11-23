package com.alexomelchuk.lesson6ArrayAndMetod.lesson6HW;

import java.util.Random;
import java.util.Scanner;

public class IdentityMatrixChecker {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int row = s.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int column = s.nextInt();
        int[][] matrix = new int[row][column];

        System.out.print("Enter the fillers: ");
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                matrix[r][c] = s.nextInt();

            }
        }

        s.close();
        System.out.println("Matrix: ");
        printMatrix(matrix);
        System.out.println("Is the identity matrix: "+ isIdentity(matrix));

    }

    public static void printMatrix(int[][] matrix) {

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                System.out.print(matrix[r][c] + "\t");
            }
            System.out.println();
        }
    }

    public static boolean isIdentity (int [][] matrix){
        boolean identity = true;
        if(matrix.length!=matrix[0].length){
            throw new IllegalArgumentException("Matrix is incorrect");
        }
        for(int i = 0; i< matrix.length; i++){
            for(int k = 0; k< matrix.length; k++){
                if(i==k && matrix[i][k]!=1){
                    identity = false;
                }
                if (i!=k && matrix[i][k]!=0){
                    identity = false;
                }
            }
        }
        return identity;
    }


}