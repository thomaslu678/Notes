package com.hillcrest.inheritance.zoo;

public class Parrot extends Bird{

    public Parrot(int age, String color, int wingSpan, boolean canFly) {
        super(age, color, wingSpan, canFly);
    }

    @Override
    public String eat(){
        return null;
    }
}
