package com.hillcrest.collections.sort;

public class LinearSearch {

    public static int searcH(int[] values, int value){
        for(int i = 0; i < values.length; i++){
            if(values[i] == value){
                return i;
            }
        }
        return 0;
    }

}
