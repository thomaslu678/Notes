package com.hillcrest.nested;

public class PowerTester {
    public static void main(String[] args) {
        tableForLoop();
        tableWhileLoop();
    }

    private static void tableWhileLoop(){
        int i =1;
        while(i <= 10){
            int j = 1;
            while (j <= 10){
                System.out.printf("%4d", i*j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
    private static void tableForLoop() {
        for(int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

}
