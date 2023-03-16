package chapter13;

import java.util.Scanner;

public class RecursiveFib {

    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.print("Enter value: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++){
            //calculate
        }

    }

    /**
     * Calculates fib based on recursion
     * @param n the nth number
     * @return the fib value
     */
    public static long fib(int n){
        if (n < 2){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

}
