package org.example.firstclasscreation;

public class Circle {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public void calculateArea() {
        System.out.println("Площадь круга " + Math.PI *(this.radius * this.radius));
    }

    public void calculateCircumference() {
        System.out.println("Длина окружности " + 2 + Math.PI * this.radius);
    }
}
