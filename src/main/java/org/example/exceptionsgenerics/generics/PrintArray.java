package org.example.exceptionsgenerics.generics;

public class PrintArray {
    public static <T> void printArray(T[] array) {
        System.out.println("Элементы массива:");
        for (T t : array) {
            System.out.println(t);
        }
    }
}