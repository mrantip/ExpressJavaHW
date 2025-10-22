package org.example.oopJava.Restaurant;

public class Drink extends Dish {
    private int volume;

    public Drink(int volume) {
        this.volume = volume;
    }

    @Override
    public void getDescription() {
        System.out.println("Напиток с объёмом " + volume);
    }
}
