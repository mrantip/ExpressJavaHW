package org.example.collections.LinkedList;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        Task1 task1 = new Task1();
        task1.addString("Строка 1");
        task1.addString("Строка 2");
        task1.addString("Строка 3");
        task1.addString("Строка 4");
        task1.addString("Строка 5");
        task1.printList();

        //Задача 2
        Task2 task2 = new Task2();
        task2.addTask("Задача 1");
        task2.addTask("Задача 2");
        task2.addTask("Задача 3");
        task2.processTasks();
    }
}