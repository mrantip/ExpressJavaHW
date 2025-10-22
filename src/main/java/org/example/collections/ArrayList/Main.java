package org.example.collections.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        Task1 task1 = new Task1();
        task1.addNumber(10);
        task1.printList();

        //Задача 2
        Task2 task2 = new Task2();
        task2.addNumber(2);
        task2.addNumber(1);
        task2.addNumber(6);
        task2.addNumber(5);
        task2.addNumber(9);
        task2.addNumber(7);
        task2.printEvenNumbers();
    }
}
