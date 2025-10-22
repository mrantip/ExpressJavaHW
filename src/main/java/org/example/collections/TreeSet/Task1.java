package org.example.collections.TreeSet;

import java.util.TreeSet;

public class Task1 {
    private TreeSet<Integer> set;

    public Task1() {
        this.set = new TreeSet<>();
    }

    public void addNumber(int number) {
        set.add(number);
    }

    public void printTreeSet() {
        System.out.println("Список чисел:");
        set.forEach(System.out::println);
        System.out.println();
    }
}