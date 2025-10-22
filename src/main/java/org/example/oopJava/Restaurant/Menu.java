package org.example.oopJava.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Dish> dishes;

    public Menu() {
        this.dishes = new ArrayList<>();
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
        System.out.println("Блюдо добавлено");
    }

    public void printMenu() {
        for (Dish value : dishes) {
            value.getDescription();
        }
    }
}