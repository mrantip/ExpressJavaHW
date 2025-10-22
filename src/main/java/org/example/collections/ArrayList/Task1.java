package org.example.collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    private ArrayList<Integer> list;

    public Task1() {
        this.list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    }

    public void addNumber(int number) {
        list.add(number);
    }

    public void printList() {
        System.out.println("Список чисел:");
        System.out.println(list);
    }
}