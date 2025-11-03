package org.example.oopJava.Farm;

public class Chicken extends FarmAnimal {
    @Override
    public void need() {
        System.out.println("Курица требует зерно");
    }

    @Override
    public void produce() {
        System.out.println("Курица несёт яйца");
    }
}