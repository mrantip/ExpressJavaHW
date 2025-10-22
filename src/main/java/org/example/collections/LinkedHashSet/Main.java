package org.example.collections.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        Task1 task1 = new Task1();
        task1.addString("Строка 1");
        task1.addString("Строка 3");
        task1.addString("Строка 2");
        task1.addString("Строка 4");
        task1.addString("Строка 5");
        task1.printSet();
    }
}