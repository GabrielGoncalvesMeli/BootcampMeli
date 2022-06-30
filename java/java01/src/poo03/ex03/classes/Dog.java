package poo03.ex03.classes;

import poo03.ex03.interfaces.Carnivore;

public class Dog extends Animal implements Carnivore {
    @Override
    public void makeSound() {
        System.out.println("AUAUAU!!!");
    }

    @Override
    public void eatMeat() {
        System.out.println("Is there anymore? I'm still hungry :/");
    }
}
