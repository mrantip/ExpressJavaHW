package org.example.loop;

import java.util.Scanner;

public class WhileSolver {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1. Вычисление факториала с помощью while
        System.out.print("Введите число ");
        int n = scanner.nextInt();
        calculateFactorial(n);

        //2. Вывод всех чётных чисел до заданного
        System.out.print("Введите число ");
        int num = scanner.nextInt();
        printEvenNumbers(num);

        //3. Обратный отсчёт от введённого числа до 1
        System.out.print("Введите число ");
        int number = scanner.nextInt();
        countDown(number);

        scanner.close();
    }

    public static void calculateFactorial(int n) {
        int result = 1;
        int i = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        System.out.println("Факториал " + n + " равен " + result);
    }

    public static void printEvenNumbers(int num) {
        int i = 1;
        while (i <= num) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void countDown(int number) {
        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }
}