package org.example.collections.LinkedHashSet;

import java.util.LinkedHashSet;

public class Task1 {
    private LinkedHashSet<String> set;

    public Task1() {
        this.set = new LinkedHashSet<>();
    }

    public void addString(String str) {
        set.add(str);
    }

    public void printSet() {
        System.out.println("Список строк:");
        set.forEach(System.out::println);
        System.out.println();
    }
}