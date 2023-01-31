package com.hillcrest.inheritance.zoo;

public class Ostrich extends Bird{


    public Ostrich(int age, String color, int wingSpan, boolean canFly) {
        super(age, color, 7, canFly);
    }

    public String eat(){
        return "Eating plants, lizards and insects";
    }

    public String fly(){
        return "oops I don't fly";
    }

}
