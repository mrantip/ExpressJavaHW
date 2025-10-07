package org.example.loop;

import java.util.Scanner;

public class ForSolver {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1. Вывод чисел от 1 до 100, делящихся на 3
        printDividable3();

        //2. Сумма чисел от 1 до n
        System.out.print("Введите число ");
        int n = scanner.nextInt();
        sumOfNumbers(n);

        //3. Таблица умножения для числа
        System.out.print("Введите число ");
        int num = scanner.nextInt();
        multiplyTable(num);

        //4. Проверка на простое число
        System.out.print("Введите число ");
        int number = scanner.nextInt();
        System.out.println(checkNumberIsSimple(number));

        //5. Вывод чисел от 1 до 10
        print1to10();

        scanner.close();
    }

    public static void printDividable3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void sumOfNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Сумма числе от 1 до " + n + " равна " + sum);
    }

    public static void multiplyTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static boolean checkNumberIsSimple(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void print1to10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}