package com.hillcrest.collections.sort;

import java.util.Random;

public class ArrayUtils {

    private static Random random = new Random();

    public static int[] randomIntArray(int length, int limit){

        var values = new int[length];
        for(int i = 0; i < length; i++){
            values[i] = random.nextInt();
        }

        return values;

    }

    /**
     * Swaps two elements in an array
     * @param values the array
     * @param i the first value's position
     * @param j the second value's position
     */
    public static void swap(int[] values, int i, int j){

        int temp = values[i];
        values[i] = values[j];
        values[j] = temp;

    }

}
