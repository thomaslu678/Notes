package com.hillcrest.inheritance.zoo;

public class Tiger extends Cat{

    private int numberOfStripes;

    public Tiger(int age, String hairTexture, int numberOfStripes){
        super(age, "orange", hairTexture, 25);
        this.numberOfStripes = numberOfStripes;
    }
}
