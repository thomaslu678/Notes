package com.hillcrest.chapter10;

public class BankAccount implements Measurable{

    private double balance;
    private String name;

    public BankAccount(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getMeasure(){
        return balance;
    }

}
