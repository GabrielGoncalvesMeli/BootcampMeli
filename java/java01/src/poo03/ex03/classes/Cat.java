package poo03.ex03.classes;

import poo03.ex03.interfaces.Carnivore;

public class Cat extends Animal implements Carnivore {
    @Override
    public void makeSound() {
        System.out.println("MIAW");
    }

    @Override
    public void eatMeat() {
        System.out.println("Yeah this is a nice meat, miaw");
    }
}
