package org.example.exceptionsgenerics.exceptions.customchecked;

import java.util.Scanner;

import static org.example.exceptionsgenerics.exceptions.customchecked.CheckAge.checkAge;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите возраст");
        int age = scanner.nextInt();
        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}