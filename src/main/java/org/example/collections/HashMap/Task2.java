package org.example.collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    private HashMap<String, Integer> map;

    public Task2() {
        this.map = new HashMap<>();
    }

    public void addNameAge(String name, int age) {
        map.put(name, age);
    }

    public void checkName(String name) {
        String result = " не найдено";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getKey().equals(name)) {
                result = " найдено";
                break;
            }
        }
        System.out.println("Имя " + name + result);
    }
}