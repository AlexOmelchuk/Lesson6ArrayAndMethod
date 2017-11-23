package com.alexomelchuk.lesson6ArrayAndMetod.lesson6HW;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySumCalculator {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the numbers of cells in the array: ");
        int number = s.nextInt();
        int [] array = new int [number];
        for (int filler = 0; filler< number; filler++){
            System.out.print("Enter the filler in the array: ");
            array [filler] = s.nextInt();
        }
        s.close();

        System.out.println("Array: "+Arrays.toString(array));
        System.out.println("Array sum: "+sum(array));


    }
    public static int sum (int [] array){
        int sum = 0;
        for (int elem : array){
            sum +=elem;
        }
        return sum;
    }

}
