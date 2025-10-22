package org.example.collections.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Task1 {
    private TreeMap<String, Integer> map;

    public Task1() {
        this.map =new TreeMap<>();
    }

    public void addScore(String name, int score) {
        map.put(name, score);
    }

    public void printScore() {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " баллов");
        }
    }
}