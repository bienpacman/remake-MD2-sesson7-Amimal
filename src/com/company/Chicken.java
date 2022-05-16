package com.company;

public class Chicken extends Animal implements Edible
{
    @Override
    public String makeSound() {
        return "Chicken :Chíp chíp";
    }

    @Override
    public String howToEat() {
        return "Nướng lên";
    }
}
