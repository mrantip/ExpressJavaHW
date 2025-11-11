package org.example.exceptionsgenerics.exceptions.customunchecked;

import java.util.Scanner;

import static org.example.exceptionsgenerics.exceptions.customunchecked.ValidateEmail.validateEmail;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите email");
        String email = scanner.nextLine();
        validateEmail(email);
    }
}