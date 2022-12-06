package com.ing.zoo;

import Interface_Classes.Carnivore;
import Interface_Classes.Herbivore;
import Interface_Classes.Tricks;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {

        // All possible commands.
        String[] commands = new String[10];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";
        commands[5] = "hello henk";
        commands[6] = "hello elsa";
        commands[7] = "hello dora";
        commands[8] = "hello wally";
        commands[9] = "hello marty";


        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        // An array with all the animals.
        Animal[] animals = {new Hippo(), new Lion(), new Pig(), new Tiger(), new Zebra(), new Crocodile(), new Elephant()};
        // An array with all the herbivore animals.
        Herbivore[] herbivors = {new Elephant(), new Hippo(), new Pig(), new Zebra()};
        // An array with all the carnivore animals.
        Carnivore[] carnivors = {new Crocodile(), new Lion(), new Pig(), new Tiger()};
        // An array with animals that can perform tricks.
        Tricks[] trickPerformers = {new Tiger(),new Pig(), new Elephant()};

        while (true) {

            String input = scanner.nextLine();
            switch(input) {
                case  "hello": for (int i = 0; i < animals.length; i++)
                    animals[i].sayHello();
                    break;
                case  "give leaves": for (int i = 0; i < herbivors.length; i++)
                    herbivors[i].eatLeaves();
                    break;
                case  "give meat": for (int i = 0; i < carnivors.length; i++)
                    carnivors[i].eatMeat();
                    break;
                case  "perform trick": for (int i = 0; i < trickPerformers.length; i++)
                    trickPerformers[i].performTrick();
                    break;
                case  "hello henk": henk.sayHello();
                    break;
                case  "hello elsa": elsa.sayHello();
                    break;
                case  "hello dora": dora.sayHello();
                    break;
                case  "hello wally": wally.sayHello();
                    break;
                case  "hello marty": marty.sayHello();
                    break;
                default:
                    System.out.println("Unknown command: " + input);
                    break;
            }
        }


    }
}
