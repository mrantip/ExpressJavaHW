package org.example.oopJava.Pet;

public class Dog extends Pet {
    @Override
    public void feed() {
        System.out.println("Собака ест сухой корм");
    }

    @Override
    public void interact() {
        System.out.println("Собака гуляет");
    }
}