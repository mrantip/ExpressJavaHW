package org.example.collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    private HashMap<String, Integer> map;

    public Task1() {
        this.map = new HashMap<>();
    }

    public void addNameAge(String name, int age) {
        map.put(name, age);
    }

    public void printNameAge() {
        System.out.println("Словарь содержит следующие элементы: ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();
            int age = entry.getValue();
            System.out.println(name + " - " + age + " лет");
        }
    }
}