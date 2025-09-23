package org.example;

public class Main {
    public static void main(String[] args) {

        MathOperations mathOperations = new MathOperations();
        System.out.println("Сумма чисел равна " + mathOperations.add(5, 3));
        System.out.println("Разность чисел равна " + mathOperations.subtract(10, 8));
        System.out.println("Произведение чисел равно " + mathOperations.multiply(5, 3));
        System.out.println("Результат деления равен " + mathOperations.divide(99, 25));
        System.out.println("Максимальное число равно " + mathOperations.findMax(3, 4));
        System.out.println("Разница между числами равна " + mathOperations.difference(1, 99));
        System.out.println("Площадь квадрата равна " + mathOperations.squareArea(5));
        System.out.println("Периметр квадрата равен " + mathOperations.squarePerimeter(6));
        System.out.println("Количество минут равно " + mathOperations.convertSecondsToMinutes(5));
        System.out.println("Средняя скорость равна " + mathOperations.averageSpeed(100, 2));
        System.out.println("Средняя скорость равна " + mathOperations.averageSpeed(452.4, 2.05));
        System.out.println("Средняя скорость равна " + mathOperations.averageSpeed(452.4, 0));
        System.out.println("Гипотенуза равна " + mathOperations.findHypotenuse(5.05, 9.09));
        System.out.println("Гипотенуза равна " + mathOperations.findHypotenuse(24.24, 39.39));
        System.out.println("Длина окружности равна " + mathOperations.circleCircumference(5));
        System.out.println("Длина окружности равна " + mathOperations.circleCircumference(36.6));
        System.out.println("Длина окружности равна " + mathOperations.circleCircumference(0.6));
        System.out.println("Процент равен " + mathOperations.calculatePercentage(400, 100) + "%");
        System.out.println("Процент равен " + mathOperations.calculatePercentage(0, 100) + "%");
        System.out.println("Значения в Фаренгейтах равно " + mathOperations.celsiusToFahrenheit(36.6));
        System.out.println("Значения в Цельсиях равно " + mathOperations.fahrenheitToCelsius(451));
    }
}