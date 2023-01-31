package com.hillcrest.chapter10;

public class MeasureTester {

    public static void main(String[] args) {
        Measurable[] accounts = new Measurable[3];
        accounts[0] = new BankAccount(500, "checking");
        accounts[1] = new BankAccount(1200, "savings");
        accounts[2] = new BankAccount(800, "checking");

        double average = Measurable.getAverage(accounts);
        System.out.println("Average balance: " + average);

        Measurable[] students = new Measurable[3];
        students[0] = new Student("Jim Jones", 3.7, 2, "Senior");
        students[1] = new Student("Sally Jensen", 1.0, 3, "Kindergarten");
        students[2] = new Student("Harsha", 3.5, 17, "Freshman");

        double averageGpa = Measurable.getAverage(students);
        System.out.println("Average balance: " + averageGpa);

    }

}
