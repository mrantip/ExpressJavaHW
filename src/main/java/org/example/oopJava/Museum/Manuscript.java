package org.example.oopJava.Museum;

public class Manuscript extends Exhibit {
    @Override
    public void describe() {
        System.out.println("Манускрипт - старая бумага");
    }

    @Override
    public void preserve() {
        System.out.println("Манускрипт требует контролируемой влажности");
    }
}