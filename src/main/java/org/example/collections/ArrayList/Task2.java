package org.example.collections.ArrayList;

import java.util.ArrayList;

public class Task2 {
    private ArrayList<Integer> list;

    public Task2() {
        this.list = new ArrayList<>();
    }

    public void addNumber(int number) {
        list.add(number);
    }

    public void printEvenNumbers() {
        System.out.println("Список четных чисел:");
        for (int num : list) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}