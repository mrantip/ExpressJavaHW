package org.example.collections.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        Task1 task1 = new Task1();
        task1.addInfo("Маша", 554);
        task1.addInfo("Саша", 2);
        task1.addInfo("Даша", 5474);
        task1.addInfo("Паша", 989787);
        task1.addInfo("Антоша", 12345);
        task1.printInfo();
    }
}