package com.company;

public class Tiger extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Tiger: Graoooooo";
    }

    @Override
    public String howToEat() {
        return "Luộc nó";
    }
}
