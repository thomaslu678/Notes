package com.hillcrest.bank;

import java.util.Scanner;

public class BankAccountTester {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome. This program is an interest calculator. ");
        System.out.print("Enter the amount of your deposit: ");
        double balance = in.nextDouble();

        System.out.print("Enter the interest rate: ");
        double rate = in.nextDouble();

        BankAccount account = new BankAccount(balance, rate, 3);

        System.out.printf("Initial Balance: %.0f\n", account.getBalance());
        System.out.printf("Annual interest rate: %.1f\n", account.getRate());

        account.calculateOneMonthInterest();
        System.out.printf("After first month: %10.2f\n", account.getBalance());

        account.calculateOneMonthInterest();
        System.out.printf("After second month: %9.2f\n", account.getBalance());

        account.calculateOneMonthInterest();
        System.out.printf("After third month: %10.2f\n", account.getBalance());
    }

}
