package com.ing.zoo;

import Interface_Classes.Carnivore;

public class Crocodile extends Animal implements Carnivore {

    @Override
    public void sayHello()
    {
        helloText = "rharg";
        System.out.println(helloText);
    }
    @Override
    public void eatMeat()
    {
        eatText = "ammnannananam deeelicious";
        System.out.println(eatText);
    }
}
