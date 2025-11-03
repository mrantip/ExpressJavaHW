package org.example.exceptionsgenerics.exceptions.unchecked;

public class UncheckedException {
    public static void divideTwoNumbers(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Результат деления равен: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Делить на 0 нельзя");
        }
    }
}