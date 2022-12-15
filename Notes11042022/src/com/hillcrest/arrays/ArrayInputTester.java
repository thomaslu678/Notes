package com.hillcrest.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputTester {
    public static void main(String[] args) {
        final int INITIAL_SIZE = 10;
        int[] values = new int[INITIAL_SIZE];
        int currentSize = 0;

        System.out.println("Please enter integers or Q to quit: ");
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            if(currentSize >= values.length){
                values = Arrays.copyOf(values, 2 * values.length);
            }
            values[currentSize] = in.nextInt();
            currentSize++;

        }

        values = Arrays.copyOf(values, currentSize);

        int largest = values[0];
        for(var value: values){
            if (value > largest){
                largest = value;
            }
        }

        for(var value: values){
            System.out.print(value);
            if (value == largest){
                System.out.print("");
            }

        }

    }


}
