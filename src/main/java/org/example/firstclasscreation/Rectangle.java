package org.example.firstclasscreation;

public class Rectangle {

    private int width;
    private int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setWidth(int newWidth) {
        this.width = newWidth;
    }

    public void calculateArea() {
        System.out.println("Площадь равна " + this.width * this.height);
    }
}
