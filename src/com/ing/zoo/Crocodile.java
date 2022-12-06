package com.ing.zoo;

import Interface_Classes.Carnivore;

public class Crocodile extends Animal implements Carnivore {
    public String name;
    public String helloText;
    public String eatText;
    public Crocodile() {
    }

    @Override
    public void sayHello()
    {
        helloText = "rharg";
        System.out.println(helloText);
    }
    @Override
    public void eatMeat()
    {
        eatText = "ammnannananam daaalicious";
        System.out.println(eatText);
    }
}
