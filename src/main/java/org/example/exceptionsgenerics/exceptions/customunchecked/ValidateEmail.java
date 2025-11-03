package org.example.exceptionsgenerics.exceptions.customunchecked;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public static void emailValidator(String email) {
        if (email == null) {
            throw new InvalidEmailException("Email не может быть null");
        }
        if (email.isEmpty()) {
            throw new InvalidEmailException("Email не может быть пустой");
        }
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        if (!matcher.matches()) {
            throw new InvalidEmailException("Неверный формат email");
        }
    }

    public static void validateEmail(String email) {
        try {
            emailValidator(email);
            System.out.println("Email " + email + " валиден");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }
}