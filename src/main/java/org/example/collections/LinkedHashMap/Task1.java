package org.example.collections.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    private LinkedHashMap<String, Integer> map;

    public Task1() {
        this.map = new LinkedHashMap<>();
    }

    public void addInfo(String name, int number) {
        map.put(name, number);
    }

    public void printInfo() {
        System.out.println("Перечень всех элементов:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();
            int number = entry.getValue();
            System.out.println("Имя: " + name + " , номер: " + number);
        }
    }
}