package org.example.collections.HashMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        Task1 task1 = new Task1();
        task1.addNameAge("Маша", 55);
        task1.addNameAge("Саша", 25);
        task1.addNameAge("Даша", 35);
        task1.addNameAge("Паша", 45);
        task1.addNameAge("Глаша", 105);
        task1.printNameAge();

        //Задача 2
        Task2 task2 = new Task2();
        task2.addNameAge("Маша", 55);
        task2.addNameAge("Саша", 25);
        task2.addNameAge("Даша", 35);
        task2.addNameAge("Паша", 45);
        task2.addNameAge("Глаша", 105);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        task2.checkName(name);
        scanner.close();

    }
}