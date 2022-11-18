package com.hillcrest.interest;
import java.util.Scanner;

public class InvestmentTester {
    public static void main(String[] args) {
        Investment investment = new Investment(10000, 5);
        double targetBalance = 20000;
        investment.getToBalance(targetBalance);
        System.out.printf("It took %d years to get to %.2f\n", investment.getYear(), targetBalance);

        int year = 0;
        Scanner in = new Scanner(System.in);

        do{
            System.out.print("Enter the number of years for your investment: ");
            if(!in.hasNextInt()) {
                System.out.println("Invalid input. values must be greater than 0 and less than 30.");
            } else{
                year = in.HasNextInt();
            }
        } while (year < 0 || year > 30);


        Investment investment2 = new Investment(10000, 5, year);
        investment2.growBalance();
        System.out.printf("After %d years, the balance is %.2f", year, investment2.getBalance());

    }
}
