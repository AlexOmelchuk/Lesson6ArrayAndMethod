package com.alexomelchuk.lesson6ArrayAndMetod.lesson6HW;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFiller {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the numbers of cells in the array: ");
        int number = s.nextInt();
        int [] array = new int [number];
        System.out.print("Enter the filler in the array: ");
        int filler = s.nextInt();
        s.close();
        fill(array, filler);
    }
    public static void fill(int[] array, int filler){
        for(int i = 0; i<array.length; i++){
            array [i] = filler;
        }
        System.out.println(Arrays.toString(array));
    }
}
