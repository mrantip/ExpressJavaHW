package org.example.exceptionsgenerics.exceptions.unchecked;

import static org.example.exceptionsgenerics.exceptions.unchecked.UncheckedException.divideTwoNumbers;

public class Main {
    public static void main(String[] args) {
        divideTwoNumbers(1, 2);
        divideTwoNumbers(10, 0);
    }
}