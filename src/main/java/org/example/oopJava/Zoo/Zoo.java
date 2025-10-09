package org.example.oopJava.Zoo;

public class Zoo {
    private Animal animal;

    public void addAnimal(Animal animal) {
        this.animal = animal;
        System.out.println("Животное добавлено/обновлено");
    }

    public void forceMakeSound() {
        this.animal.makeSound();
    }

    public void forceMove() {
        this.animal.move();
    }
}