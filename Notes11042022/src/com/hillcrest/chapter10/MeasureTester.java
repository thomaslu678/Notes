package com.hillcrest.chapter10;

import java.awt.*;
import java.awt.geom.Area;
import java.util.Arrays;

public class MeasureTester {

    public static void main(String[] args) {
        measurable();
        var areaMeasurer = new AreaMeasurer();
        Rectangle[] rects = {new Rectangle(10, 10, 10, 20), new Rectangle(20, 30, 50, 70)};

        double averageArea = Data.average(rects, areaMeasurer);
        System.out.println("The average area is " + averageArea);

        String[] strings = {
                "Hi there", "Today is Thursday", "It's winter"
        };

        double averageLength = Data.average(strings,
                (Object obj) -> ((String)obj).length());
        System.out.println("The average string length is " + averageLength);

    }

    private static void measurable() {
        Measurable[] accounts = new Measurable[3];
        accounts[0] = new BankAccount(500, "checking");
        accounts[1] = new BankAccount(1200, "savings");
        accounts[2] = new BankAccount(800, "checking");

        double average = Measurable.getAverage(accounts);
        System.out.println("Average balance: " + average);
        Arrays.sort(accounts);

        for(var account : accounts){
            System.out.println(account.getMeasure());
        }

        Measurable[] students = new Measurable[3];
        students[0] = new Student("Jim Jones", 3.7, 2, "Senior");
        students[1] = new Student("Sally Jensen", 1.0, 3, "Kindergarten");
        students[2] = new Student("Harsha", 3.5, 17, "Freshman");

        double averageGpa = Measurable.getAverage(students);
        System.out.println("Average balance: " + averageGpa);
        Arrays.sort(students);
        for(var student : students){
            System.out.println(student.getMeasure());
        }
    }

}
