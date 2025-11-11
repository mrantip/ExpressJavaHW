package org.example.exceptionsgenerics.generics;

import static org.example.exceptionsgenerics.generics.PrintArray.printArray;

public class Main {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3};
        String[] array2 = {"Строка 1", "Строка 2", "Строка 3"};
        printArray(array1);
        printArray(array2);
    }
}