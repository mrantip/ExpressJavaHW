package org.example.collections.PriorityQueue;

import java.util.PriorityQueue;

public class Task1 {
    private PriorityQueue<Integer> queue;

    public Task1() {
        this.queue = new PriorityQueue<>();
    }

    public void addNumber(int number) {
        queue.add(number);
    }

    public void printQueue() {
        System.out.println("Числа в порядке удаления: ");
        while (!queue.isEmpty()) {
            int num = queue.poll();
            System.out.println(num);
        }
    }
}