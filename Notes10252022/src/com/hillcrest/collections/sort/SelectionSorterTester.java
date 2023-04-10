package com.hillcrest.collections.sort;

import java.util.Arrays;

public class SelectionSorterTester {

    public static void main(String[] args) {

        var values = ArrayUtils.randomIntArray(20, 20);
        System.out.println("Before: " + Arrays.toString(values));
        SelectionSorter.sort(values);
        System.out.println("After: " + Arrays.toString(values));

    }

}
