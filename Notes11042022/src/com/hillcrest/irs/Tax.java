package com.hillcrest.irs;

public class Tax {
    public static final int SINGLE = 1;
    public static final int MARRIED = 2;

    private static final double RATE1 = .10;
    private static final double RATE2 = .25;
    private static final double SINGLE_LIMIT = 32000;
    private static final double MARRIED_LIMIT = 64000;

    private int status;
    private double income;

    public Tax(int status, double income) {
        this.status = status;
        this.income = income;
    }

    public double getTax() {
        double tax1 = 0;
        double tax2 = 0;

        if(status == SINGLE){
            if(income <= SINGLE_LIMIT){
                tax1 = RATE1 * income;
            }
            else{
                tax1 = SINGLE_LIMIT * RATE1;
                tax2 = (income - SINGLE_LIMIT) * RATE2;
            }
        }
        else{
            if(income <= MARRIED_LIMIT) {
                tax1 = RATE1 * income;
            }
            else {
                tax1 = MARRIED_LIMIT * RATE1;
                tax2 = (income - MARRIED_LIMIT) * RATE2;
            }
        }
        return tax1 + tax2;
    }

}