package org.example.functionalinterfases.part1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Задание 1 Создайте свой функциональный интерфейс
        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> a / b;

        System.out.println(add.operate(5, 8));
        System.out.println(subtract.operate(5, 8));
        System.out.println(multiply.operate(5, 8));
        System.out.println(divide.operate(5, 8));

        //Задание 2. Использование анонимного класса
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };

        r.run();

        //Задание 3. Лямбда-выражение с Predicate
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(2));
        System.out.println(isEven.test(3));

        //Задание 4. Лямбда-выражение с Function
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println(stringLength.apply("ttt"));

        //Задание 5. Использование Consumer
        Consumer<String> print = s -> System.out.println(s);
        print.accept("String");
    }
}