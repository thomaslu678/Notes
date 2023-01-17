package com.hillcrest.inheritance.zoo;

public abstract class Animal {

    private int age;
    private String color;

    public Animal(int age, String color){
        this.age = age;
        this.color = color;
    }

    public abstract String breathe();

    public abstract String eat();



}
