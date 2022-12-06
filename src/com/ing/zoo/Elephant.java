package com.ing.zoo;

import Interface_Classes.Herbivore;
import Interface_Classes.Tricks;

import java.util.Random;

public class Elephant extends Animal implements Herbivore, Tricks {

    public String name;
    public String helloText;
    public String eatText;
    private String trick;
    public Elephant() {
    }

    @Override
    public void sayHello()
    {
        helloText = "Sluuuuuurfieeee";
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
