package org.example.collections.HashSet;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        Task1 task1 = new Task1();
        task1.addNumber(1);
        task1.addNumber(3);
        task1.addNumber(7);
        task1.addNumber(2);
        task1.addNumber(5);
        task1.printSet();

        //Задача 2
        Task2 task2 = new Task2();
        task2.addNumber(1);
        task2.addNumber(2);
        task2.addNumber(3);
        task2.addNumber(4);
        task2.addNumber(5);
        task2.addNumber(6);
        task2.addNumber(7);
        task2.addNumber(8);
        task2.addNumber(9);
        task2.addNumber(10);

        task2.checkNumber(3);
        task2.checkNumber(30);
    }
}