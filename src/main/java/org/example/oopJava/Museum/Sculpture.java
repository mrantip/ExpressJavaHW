package org.example.oopJava.Museum;

public class Sculpture extends Exhibit {
    @Override
    public void describe() {
        System.out.println("Скульптура - каменюка");
    }

    @Override
    public void preserve() {
        System.out.println("Скульптура нуждается в реставрации");
    }
}