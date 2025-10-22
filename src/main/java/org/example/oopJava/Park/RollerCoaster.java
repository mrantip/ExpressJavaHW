package org.example.oopJava.Park;

public class RollerCoaster extends Attraction {
    @Override
    public void info() {
        System.out.println("Американские горки дает острые ощущения");
    }

    @Override
    public void maintain() {
        System.out.println("Американские горки требуют проверки безопасности");
    }
}