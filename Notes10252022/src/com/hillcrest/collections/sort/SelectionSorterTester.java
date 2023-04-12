package com.hillcrest.collections.sort;

import java.util.Arrays;

public class SelectionSorterTester {

    public static void main(String[] args) {

        var values = ArrayUtils.randomIntArray(20, 20);
        var values2 = Array
        System.out.println("Before: " + Arrays.toString(values));
        SelectionSorter.sort(values);
        System.out.println("After: " + Arrays.toString(values));

        var watch = new StopWatch();
        watch.start();
        SelectionSorter.sort(values);
        watch.stop();
        System.out.println("After: " + Arrays.toString(values));
        System.out.println("It took: " + watch.getElapsedTime());
        watch.reset();
        watch.start();
        InsertionSorter.sort(values2);


    }

}
