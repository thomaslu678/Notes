package com.hillcrest.inheritance.zoo;

public class Tiger extends Cat{

    private int numberOfStripes;

    public Tiger(int age, String hairTexture, int numberOfStripes){
        super(age, "orange", 10, hairTexture, 20);
        this.numberOfStripes = numberOfStripes;
    }
}
