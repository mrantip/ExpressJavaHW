package org.example.collections.HashSet;

import java.util.HashSet;

public class Task2 {
    private HashSet<Integer> set;

    public Task2() {
        this.set = new HashSet<>();
    }

    public void addNumber(int num) {
        set.add(num);
    }

    public void checkNumber(int number) {
        if (set.contains(number)) {
            System.out.println("Список содержит число " + number);
        } else {
            System.out.println("Список не содержит число " + number);
        }
    }
}