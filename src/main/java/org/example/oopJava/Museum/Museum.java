package org.example.oopJava.Museum;

public class Museum {
    private Exhibit exhibit;

    public void addExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
        System.out.println("Экспонат добавлен/обновлен");
    }

    public void showDescription() {
        this.exhibit.describe();
    }

    public void preserveExhibit() {
        this.exhibit.preserve();
    }
}