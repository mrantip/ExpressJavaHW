package org.example.loop;

import java.util.Scanner;

public class SwitchSolver {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1. Вывод дня недели по номеру
        System.out.print("Введите номер дня недели ");
        int day = scanner.nextInt();
        dayOfWeek(day);

        //2. Стоимость билета по дню недели
        System.out.print("Введите номер дня недели ");
        int dayOfWeek = scanner.nextInt();
        ticketPriseOfDay(dayOfWeek);

        //3. Перевод числовых оценок в буквенные (A–F)
        System.out.print("Введите результат теста (0-100) ");
        int score = scanner.nextInt();
        convertTest(score);

        //4. Обработка текстовых команд
        System.out.print("Введите команду ");
        String command = scanner.nextLine();
        textCommand(command);

        //5. Простой калькулятор с использованием switch
        System.out.print("Введите первое число ");
        double a = scanner.nextDouble();
        System.out.print("Введите второе число ");
        double b = scanner.nextDouble();
        System.out.print("Введите оператор ");
        char operator = scanner.next().charAt(0);
        calculatorSwitch(a, b, operator);

        scanner.close();
    }

    public static void dayOfWeek(int day) {
        String dayOfWeek;
        switch (day) {
            case 1:
                dayOfWeek = "Понедельник";
                break;
            case 2:
                dayOfWeek = "Вторник";
                break;
            case 3:
                dayOfWeek = "Среда";
                break;
            case 4:
                dayOfWeek = "Четверг";
                break;
            case 5:
                dayOfWeek = "Пятница";
                break;
            case 6:
                dayOfWeek = "Суббота";
                break;
            case 7:
                dayOfWeek = "Воскресенье";
                break;
            default:
                dayOfWeek = "Не является днем недели";
        }
        System.out.println(dayOfWeek);
    }

    public static void ticketPriseOfDay(int dayNumber) {
        int price;
        switch (dayNumber) {
            case 6, 7:
                price = 450;
                break;
            case 1, 2, 3, 4, 5:
                price = 300;
                break;
            default:
                price = 300;
        }
        System.out.println("Цена билета " + price + "рублей");
    }

    public static void convertTest(int score) {
        int shortScore = score / 10;
        String letterScore;
        switch (shortScore) {
            case 9, 10:
                letterScore = "A";
                break;
            case 8:
                letterScore = "B";
                break;
            case 7:
                letterScore = "C";
                break;
            case 6:
                letterScore = "D";
                break;
            case 0, 1, 2, 3, 4, 5:
                letterScore = "F";
                break;
            default:
                letterScore = "Не является оценкой";
        }
        System.out.println(letterScore);
    }

    public static void textCommand(String command) {
        String result;
        switch (command) {
            case "start" -> result = "Система запущена";
            case "stop" -> result = "Система остановлена";
            case "restart" -> result = "Система перезапущена";
            case "status" -> result = "Система впорядке";
            default -> result = "Неизвестная команда";
        }
        System.out.println(result);
    }

    public static void calculatorSwitch(double a, double b, char operator) {
        switch (operator) {
            case '+':
                System.out.println("Результат операции " + (a + b));
                break;
            case '-':
                System.out.println("Результат операции " + (a - b));
                break;
            case '*':
                System.out.println("Результат операции " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Делить на 0 недльзя");
                } else {
                    System.out.println("Результат операции " + (a / b));
                }
                break;
            default:
                System.out.println("Неизвестный оператор");
        }
    }
}