package com.hillcrest.inheritance.zoo;

import java.util.Random;

public class ZooTester {

    public static void main(String[] args) {
        Animal animal;
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            int number = random.nextInt(1, 4);
            switch(number){
                case 1:
                    animal = new Tiger(6, "rough", 7);
                    break;
                case 2:
                    animal = new Ostrich(23, "gray");
                    break;
                case 3:
                    animal = new Parrot(50, "green");
                    break;
                default:
                    System.out.println("Invalid");
                    return;


            }
            System.out.println(animal);
            System.out.println(animal.breathe());
            System.out.println(animal.eat());

            if(animal instanceof Bird){
                System.out.println(((Bird)animal).fly());
                if(animal instanceof Parrot){
                    System.out.println(((Parrot)));
                }
            }
            else if(animal instanceof Cat){
                System.out.println();
            }

        }





    }

}
