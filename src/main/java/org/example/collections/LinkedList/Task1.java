package org.example.collections.LinkedList;

import java.util.LinkedList;

public class Task1 {
    private LinkedList<String> list;

    public Task1() {
        this.list = new LinkedList<>();
    }

    public void addString(String str) {
        list.add(str);
    }

    public void printList() {
        System.out.println("Все элементы списка:");
        list.forEach(System.out::println);
        System.out.println();
    }
}