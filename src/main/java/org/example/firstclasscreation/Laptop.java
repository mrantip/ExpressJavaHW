package org.example.firstclasscreation;

public class Laptop {

    private String brand;
    private double price;

    Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return this.brand;
    }

    public double getPrice() {
        return this.price;
    }

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void printInfo() {
        System.out.println("Модель " + this.brand + ", Цена " + this.price + "руб.");
    }
}
