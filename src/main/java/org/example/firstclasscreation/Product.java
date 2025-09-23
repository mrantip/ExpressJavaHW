package org.example.firstclasscreation;

public class Product {

    private String name;
    private double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void applyDiscount(int discount) {
        this.price = this.price * (1 - discount / 100.0);
    }

    public void printInfo() {
        System.out.println("Товар " + this.name + ", Цена " + this.price + "руб.");
    }
}
