package org.example.functionalinterfases.part3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        //Задание 1. Поиск максимального элемента
        List<Integer> numbersMax = Arrays.asList(1, 10, 100);
        int maxNumber = numbersMax.stream()
                .max(Comparator.naturalOrder())
                .orElse(0);
        System.out.println(maxNumber);

        //Задание 2. Поиск минимального элемента
        List<Integer> numbersMin = Arrays.asList(1, 10, 100);
        int minNumber = numbersMin.stream()
                .min(Comparator.naturalOrder())
                .orElse(0);
        System.out.println(minNumber);

        //Задание 3. Сумма всех элементов списка
        List<Integer> numbersSum = Arrays.asList(1, 2, 3, 4);
        IntStream intStream = numbersSum.stream()
                .mapToInt(n -> n);
        int sumNumbers = intStream.sum();
        System.out.println(sumNumbers);

        //Задание 4. Поиск первого элемента, начинающегося на "Б"
        List<String> stringsStartB = Arrays.asList("ААА", "Б1", "Б2");
        String StringFirstB = stringsStartB.stream()
                .filter(s -> s.startsWith("Б"))
                .findFirst()
                .toString();
        System.out.println(StringFirstB);

        //Задание 5. Проверка наличия хотя бы одного элемента по условию
        List<Integer> numbersMatch = Arrays.asList(1, 1, 3, 5, 9);
        boolean result = numbersMatch.stream()
                .anyMatch(n -> n % 2 == 0);
        System.out.println(result ? "Содержит четное число" : "Не содержит четное число");
     }
}