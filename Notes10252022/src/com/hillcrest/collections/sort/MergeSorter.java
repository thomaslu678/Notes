package com.hillcrest.collections.sort;

public class MergeSorter {

    public static void sort(int[] values) {

        if(values.length <= 1){
            return;
        }

        //Cut the array in half
        int[] first = new int[values.length / 2];
        int[] second = new int[values.length - first.length];

        //Copy the values
        for(int i = 0; i < first.length; i++) {
            first[i] = values[i];
        }
        for(int i =0; i < second.length; i++){
            second[i] = values[first.length + i];
        }
        sort(first);
        sort(second);
        merge(first, second, values);

    }

    private static void merge(int[] first, int[]second, int[] values){
        int indexFirst = 0;
        int indexSecond = 0;
        int j = 0;
    }

}
