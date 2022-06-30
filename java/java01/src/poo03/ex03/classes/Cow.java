package poo03.ex03.classes;

import poo03.ex03.interfaces.Herbivore;

public class Cow extends Animal implements Herbivore {
    @Override
    public void makeSound() {
        System.out.println("Muuu!!!");
    }

    @Override
    public void eatGrass() {
        System.out.println("noice, but that's too much green");
    }
}
