package com.hillcrest.com.hillcrest.sentinel;

import java.util.Scanner;

public class SentinelTester {

    public static void main(String[] args) {
        double sum = 0;
        int count = 0;
        double salary = 0;
        System.out.println("Enter salaries or -1 to finish: ");
        Scanner in = new Scanner(System.in);

        while(salary != -1){
            salary = in.nextDouble();
            if (salary == 0){

            }
            if(salary != -1){
                count++;
                sum += salary;
            }

            if (count > 0){
                double average = sum/count;
                System.out.printf("The average is %.2f", average);
            }
            else{
                System.out.println("No salaries entered.");
            }


        }

    }

}
