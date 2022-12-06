package com.ing.zoo;

import java.util.Random;

public class Elephant extends Animal implements Herbivore, Tricks{

    private String trick;

    @Override
    public void sayHello()
    {
        helloText = "Sluuuuurfieeee";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves()
    {
        eatText = "mjumjumjum slurfilicious";
        System.out.println(eatText);
    }

    @Override
    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "makes sound with slurf";
        }
        else
        {
            trick = "splashes water with slurf";
        }
        System.out.println(trick);
    }


}
