package com.hillcrest.inheritance.zoo;

public abstract class Mammal extends Animal{

    private int legs;
    private String hairTexture;

    public Mammal(int age, String color, int legs, String hairTexture){
        super(age, color);
        this.legs = legs;
        this.hairTexture = hairTexture;
    }

    public String breathe(){
        return "Breathing air with lungs";
    }

}
