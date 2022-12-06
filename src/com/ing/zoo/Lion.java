package com.ing.zoo;

import Interface_Classes.Carnivore;

public class Lion extends Animal implements Carnivore {
    public String name;
    public String helloText;
    public String eatText;

    public Lion()
    {
    }
    @Override
    public void sayHello()
    {
        helloText = "roooaoaaaaarr";
        System.out.println(helloText);
    }
    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
