package com.hillcrest.collections.sort;

import java.util.Arrays;

public class SelectionSorter {

    public static void sort(int[] values) {
        for(int i = 0; i < values.length; i++){
            int smallest = findSmallest(values, i);
            ArrayUtils.swap(values, smallest, i);

        }

    }

    public static int findSmallest(int[] values, int from){
        int smallest = from;
        for(int i = from + 1; i < values.length; i++){
            if(values[i] < smallest){
                smallest = i;
            }
        }
        return smallest;
    }



}
