package com.ing.zoo;

import Interface_Classes.Herbivore;

public class Hippo extends Animal implements Herbivore {
    public String name;
    public String helloText;
    public String eatText;

    public Hippo()
    {
    }
    @Override
    public void sayHello()
    {
        helloText = "splash";
        System.out.println(helloText);
    }
    @Override
    public void eatLeaves()
    {
        eatText = "munch munch munch lovely";
        System.out.println(eatText);
    }
}
