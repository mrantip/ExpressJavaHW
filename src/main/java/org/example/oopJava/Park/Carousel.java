package org.example.oopJava.Park;

public class Carousel extends Attraction {
    @Override
    public void info() {
        System.out.println("Карусель спокойный атракцион");
    }

    @Override
    public void maintain() {
        System.out.println("Карусель требует техническое обслуживание");
    }
}