package org.example.oopJava.Farm;

public class Cow extends FarmAnimal {
    @Override
    public void need() {
        System.out.println("Корова нуждается в выпасе");
    }

    @Override
    public void produce() {
        System.out.println("Корова даёт молоко");
    }
}
