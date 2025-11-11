package org.example.exceptionsgenerics.exceptions.customunchecked;

public class InvalidEmailException extends RuntimeException {
    public InvalidEmailException(String message) {
        super(message);
    }
}
