package org.example.loop;

import java.util.Scanner;

public class IfElseSolver {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1. Определение знака числа
        System.out.print("Ведите число ");
        int n = scanner.nextInt();
        determineSign(n);

        //2. Поиск наибольшего из двух чисел
        System.out.print("Ведите 1 число ");
        int a = scanner.nextInt();
        System.out.print("Ведите 2 число ");
        int b = scanner.nextInt();
        maxNumber(a, b);

        //3. Вывод оценки по шкале 1–5
        System.out.print("Ведите оценку ");
        int mark = scanner.nextInt();
        showMark(mark);

        //4. Проверка на чётность
        System.out.print("Ведите число ");
        int number = scanner.nextInt();
        checkParity(number);

        //5. Определение размера скидки по возрасту
        System.out.print("Ведите возраст ");
        int age = scanner.nextInt();
        calculateAgeDiscount(age);

        //6. Оценка результата теста по баллам
        System.out.print("Ведите результат теста ");
        int score = scanner.nextInt();
        checkTest(score);

        scanner.close();
    }

    public static void determineSign(int n) {
        if (n > 0) {
            System.out.println("Число положительное");
        } else if (n < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }
    }

    public static void maxNumber(int a, int b) {
        System.out.println("Максимальное число " + Math.max(a, b));
    }

    public static void showMark(int mark) {
        String result;
        if (mark == 5) {
            result = "Отлично";
        } else if (mark == 4) {
            result = "Хорошо";
        } else if (mark == 3) {
            result = "Удовлетворительно";
        } else if (mark == 2 || mark == 1) {
            result = "Неудовлетворительно";
        } else {
            result = "Не является оценкой";
        }

        System.out.println(result);
    }

    public static void checkParity(int number) {
        String result = "Нечетное";
        if (number % 2 == 0) {
            result = "Четное";
        }
        System.out.println(result);
    }

    public static void calculateAgeDiscount(int age) {
        if (age >= 65) {
            System.out.println("Размер скидки 30%");
        } else if (age < 18) {
            System.out.println("Размер скидки 25%");
        } else {
            System.out.println("Скидка не предусмотрена");
        }
    }

    public static void checkTest(int score) {
        String result;
        if (score >= 90 && score <= 100) {
            result = "Отлично";
        } else if (score >= 75 && score < 90) {
            result = "Хорошо";
        } else if (score >= 60 && score < 75) {
            result = "Удовлетворительно";
        } else if (score >= 0 && score < 60) {
            result = "Неудовлетворительно";
        } else {
            result = "Результат теста может быть только 0-100";
        }
        System.out.println(result);
    }
}