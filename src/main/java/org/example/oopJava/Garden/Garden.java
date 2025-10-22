package org.example.oopJava.Garden;

public class Garden {
    private Plant plant;

    public void addPlant(Plant plant) {
        this.plant = plant;
        System.out.println("Растение добавлено/обновлено");
    }

    public void careForPlant() {
        this.plant.care();
    }
}