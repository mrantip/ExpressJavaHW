package org.example.oopJava.Park;

public class Park {
    private Attraction attraction;

    public void addAttraction(Attraction attraction) {
        this.attraction = attraction;
        System.out.println("Атракцион добавлен/обновлен");
    }

    public void showInfo() {
        this.attraction.info();
    }

    public void maintainAttraction() {
        this.attraction.maintain();
    }
}