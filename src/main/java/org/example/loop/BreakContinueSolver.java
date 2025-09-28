package org.example.loop;

import java.util.Scanner;

public class BreakContinueSolver {

    public static void main(String[] args) {

        //1. Сумма чисел до первого отрицательного (использовать break)
        sumOfNumbers();

        //2. Пропуск чисел, делящихся на 3 (использовать continue)
        skipDividable3();

        //3. Вывод только положительных чисел (использовать continue)
        printPositiveNumbers();

        //4. Ввод строк до команды "stop" (использовать break)
        textCommand();

    }

    public static void sumOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n;
        while (true) {
            System.out.print("Введите число ");
            n = scanner.nextInt();
            if (n < 0) {
                break;
            } else {
                sum += n;
                System.out.println(sum);
            }
        }
        scanner.close();
    }

    public static void skipDividable3() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }

    public static void printPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Введите число ");
            n = scanner.nextInt();
            if (n > 0) {
                System.out.println(n);
            } else if (n < 0) {
                continue;
            } else break;;
        }
        scanner.close();
    }

    public static void textCommand() {
        Scanner scanner = new Scanner(System.in);
        String command;
        while (true) {
            System.out.print("Введите команду ");
            command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
        }
        scanner.close();
    }
}
