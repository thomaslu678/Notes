package com.hillcrest.random;

import java.util.Random;

public class DieTester {

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            int roll = rollDie();
            System.out.print(roll + " ");
        }
    }

    private static int rollDie() {
        var random = new Random();
        int value = 1 + random.nextInt();
        return value;
    }

}
