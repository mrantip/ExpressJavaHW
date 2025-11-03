package org.example.collections.LinkedList;

import java.util.LinkedList;

public class Task2 {
    private LinkedList<String> list;

    public Task2() {
        this.list = new LinkedList<>();
    }

    public void addTask(String task) {
        list.add(task);
    }

    public void processTasks() {
        while (!list.isEmpty()) {
            String currenTask = list.poll();
            System.out.println("Обрабатывается задача: " + currenTask);
        }
        System.out.println("Все задачи обработаны");
    }
}