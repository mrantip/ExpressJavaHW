package org.example.collections.HashSet;

import java.util.HashSet;

public class Task1 {
    private HashSet<Integer> set;

    public Task1() {
        this.set = new HashSet<>();
    }

    public void addNumber(int num) {
        set.add(num);
    }

    public void printSet() {
        System.out.println("Список чисел:");
        System.out.println(set);
    }
}