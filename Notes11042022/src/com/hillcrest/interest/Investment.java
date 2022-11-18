package com.hillcrest.interest;

/**
 * tracks the growth of an investment over time at a fixed rate
 */
public class Investment {
    private double balance;
    private double rate;
    private int year;

    /**
     * Constructs an investment object
     * @param balance the starting balance
     * @param rate the interest rate
     */
    public Investment(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
        this.year = 0;
    }

    /**
     * Keep calculating balance until the target balance is reached
     * @param targetBalance the desired balance
     */
    public void getToBalance(double targetBalance){
        while (balance < targetBalance){
            year++;
            var interest = balance * rate / 100;
            balance += interest;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void growBalance(){
        for (int i = 0; i < year; i++) {
            var interest = balance * rate / 100;
            balance += interest;
        }
    }

    public int getYear(){
        return year;
    }
}
