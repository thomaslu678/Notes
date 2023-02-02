package com.hillcrest.chapter10;

public class Data {

    public static double average(Object[] objects, Measurer measurer){
        double sum = 0;
        for(var object : objects){
            sum += measurer.measure(object);
        }
        if(objects.length > 0){
            return sum / objects.length;
        }
        else{
            return 0;
        }
    }

}
