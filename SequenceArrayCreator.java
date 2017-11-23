package com.alexomelchuk.lesson6ArrayAndMetod.lesson6HW;

import java.util.Arrays;
import java.util.Scanner;

public class SequenceArrayCreator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of cells in the array: ");
        int size = s.nextInt();

        s.close();

        System.out.print("Array: " + Arrays.toString(createSequenceArray(size)));

    }

    public static int[] createSequenceArray(int size) {
        int i = 0;
        int filler = 0;
        int[] array = new int[size];
        if (size >= 0) {
            for (i = 0; i < size; i++) {
                array[i] = filler++;
            }

        } else {
            throw new IllegalArgumentException("size<0");
        }
        return array;
    }

}

