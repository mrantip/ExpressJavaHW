package org.example.exceptionsgenerics.exceptions.customchecked;

public class InvalidAgeException extends Exception{
    public InvalidAgeException(String message) {
        super(message);
    }
}