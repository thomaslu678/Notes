package com.hillcrest.bank;

/**
 * Represent an account with interest
 */

public class BankAccount {

    private double balance;
    private double rate;
    private int monthsToCalculate;

    public BankAccount(double balance, double rate, int monthsToCalculate) {
        this.balance = balance;
        this.rate = rate;
        this.monthsToCalculate = monthsToCalculate;
    }

    public double calculateOneMonthInterest() {
        balance = (balance * (1 + ((rate/100)/12)));
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public double getRate() {
        return rate;
    }
}
