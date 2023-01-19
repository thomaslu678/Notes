package com.hillcrest.inheritance.zoo;

public class Cat extends Mammal{

    private int purrVolume;

    public Cat(int age, String hairColor, int legs, String hairTexture, int purrVolume){
        super(age, hairColor, legs, hairTexture);
        this.purrVolume = purrVolume;
    }

    public String eat(){
        return "Yummy meat";
    }

    public String stalkPrey(){
        return "shhhh stalking...";
    }

}
