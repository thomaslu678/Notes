package com.hillcrest.chapter10;

public class BankAccount implements Measurable, Comparable{

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

    @Override
    public int compareTo(Object o) {
        BankAccount other = (BankAccount) o;
        if(this.balance < other.balance){
            return -1;
        }
        else if (this.balance == other.balance){
            return 0;
        }
        else{
            return 1;
        }
    }
}
