package org.example.exceptionsgenerics.exceptions.customchecked;

public class CheckAge {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Возраст не может быть меньше 0 и больше 150 лет");
        } else {
            System.out.println("Возраст корректен: " + age);
        }
    }
}