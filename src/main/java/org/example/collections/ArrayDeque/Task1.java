package org.example.collections.ArrayDeque;

import java.util.ArrayDeque;

public class Task1 {
    private ArrayDeque<Integer> deque;

    public Task1() {
        this.deque = new ArrayDeque<>();
    }

    public void addNumber(int number) {
        deque.add(number);
    }

    public void printDeque() {
        System.out.println("Список элементов:");
        deque.forEach(System.out::println);
        System.out.println();
    }
}