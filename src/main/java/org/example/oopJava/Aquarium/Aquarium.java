package org.example.oopJava.Aquarium;

public class Aquarium {
    private SeaCreature seaCreature;

    public void addSeaCreature(SeaCreature seaCreature) {
        this.seaCreature = seaCreature;
        System.out.println("Морское существо добавлено/обновлено");
    }

    public void showBehavior() {
        this.seaCreature.move();
    }
}