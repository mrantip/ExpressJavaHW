package org.example.loop;

import java.util.Scanner;

public class DoWhileSolver {

    public static void main(String[] args) {

        //1. Запрос положительного числа
        findPositiveNumber();

        //2. Проверка пароля
        checkPassword();

        //3. Вывод чисел от 1 до 10 с использованием do-while
        print1to10DoWhile();

        //4. Завершение программы по команде "exit"
        closeProgramm();

        //5. Подсчёт количества цифр в числе
        calculateDigitsInNumber();

    }

    public static void findPositiveNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Введите число ");
            number = scanner.nextInt();
        }
        while (number <= 0);
        System.out.println("Число положительное");

        scanner.close();
    }

    public static void checkPassword() {
        String correctPassword = "1234";
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("Введите пароль ");
            input = scanner.nextLine();
        }
        while (!input.equals(correctPassword));
        System.out.println("Верный пароль!");

        scanner.close();
    }

    public static void print1to10DoWhile() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while (i <= 10);
    }

    public static void closeProgramm() {
        Scanner scanner = new Scanner(System.in);
        String command;
        do {
            System.out.print("Введите команду ");
            command = scanner.nextLine();
        }
        while (!command.equals("exit"));
        System.out.println("Вы вышли из программы");

        scanner.close();
    }

    public static void calculateDigitsInNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int count;

        do {
            System.out.print("Введите число ");
            number = scanner.nextInt();

            if (number == 0) {
                count = 1;
            }
            else {
                count = 0;
                int tempNumber = number;

                do {
                    tempNumber = tempNumber / 10;
                    count++;
                }
                while (tempNumber > 0);
            }
            System.out.println("Количество цифр в числе " + number + " равно " + count);
        }
        while (false);
    }
}
