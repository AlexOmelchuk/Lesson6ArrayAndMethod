package com.alexomelchuk.lesson6ArrayAndMetod.lesson6HW;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPositiveFinder {
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
        System.out.println("Array "+ Arrays.toString(array));
        System.out.println("First positive number "+findFirstPositiveElemIndex(array));
        System.out.println("Last positive number "+ findLastPositiveElemIndex(array));
    }
    public static int findFirstPositiveElemIndex (int []array){
        int first = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i]>0){
                first = i;
                break;

            }else {
               first = -1;

            }
        }
        return first;
    }
    public static int findLastPositiveElemIndex (int []array){
        int last = 0;
        for (int i = array.length - 1; i>0; i--){
            if(array[i]>0 ){
                last = i;
                break;
            }else{
                last = -1;
            }
        }
        return last;
    }
}
