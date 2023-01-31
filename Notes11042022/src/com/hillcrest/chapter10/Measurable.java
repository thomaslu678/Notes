package com.hillcrest.chapter10;

public interface Measurable {

    String TYPE = "NONE";

    double getMeasure();

    static double getAverage(Measurable[] objects){
        double sum = 0;
        for(var object : objects){
            sum += object.getMeasure();
        }

        if(objects.length > 0){
            return sum / objects.length;
        }
        else{
            return 0;
        }
    }

}
