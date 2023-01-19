package com.hillcrest.inheritance.zoo;

public abstract class Bird extends Mammal{

    private int wingSpan;
    private boolean canFly;

    public Bird(int age, String color, int wingSpan, boolean canFly){
        super(age, color);
        this.wingSpan = wingSpan;
        this.canFly = canFly;
    }

    public String breathe(){
        return "breathing air through lungs";
    }

    public String fly(){
        return "Gracefully soaring";
    }

}
