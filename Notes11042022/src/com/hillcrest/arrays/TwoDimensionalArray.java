package com.hillcrest.arrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        String[] countries = {"United States", "China", "Canada", "Russia", "Mozambique"};

        int[][] medalCount = {
                {0, 3, 0},
                {0, 0, 1},
                {1, 2, 3},
                {4, 0, 1},
                {0, 2, 0}
        };

        System.out.printf("%15s%10s%10s%10s%10s\n", "Country", "Gold", "Silver", "Bronze", "Total");
        for (int i = 0; i < medalCount.length; i++){
            System.out.printf("%15s", countries[i]);
            //print the columns
            int totalMedals = 0;
            for (int j = 0; j < medalCount[i].length; j++){
                totalMedals += medalCount[i][j];
                System.out.printf("%10d", medalCount[i][j]);
            }
            System.out.printf("%10d", totalMedals);
            System.out.println();


        }

        System.out.printf("%15s", "Total");
        for (int i = 0; i < medalCount[i].length; i++){
            int totalMedals = 0;
            for (int j = 0; j < medalCount.length; j++){
                totalMedals += medalCount[j][i];

            }
            System.out.printf("%10d", totalMedals);

        }

        System.out.println();

    }

}
