package org.example.oopJava.Restaurant;

public class HotDish extends Dish {
    private int temperature;

    public HotDish(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void getDescription() {
        System.out.println("Горячее блюдо с температурой " + temperature);
    }
}
