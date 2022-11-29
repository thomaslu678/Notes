package com.hillcrest.random;

import java.util.Random;

public class MonteCarloTester {

    public static void main(String[] args) {
        final int TIMES = 4;
        var random = new Random();

        int hits = 0;
        for (int i = 0; i < TIMES; i++) {
            var value = random.nextDouble();
            var x = -1 + 2 * value;
            value = random.nextDouble();
            var y = -1 + 2 * value;

            if (x * x + y * y <= 1){
                hits++;

            }
        }

        var piEstimate = 4.0 * hits/TIMES;
        System.out.println("Estimate for ");
    }

}
