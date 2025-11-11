package org.example.functionalinterfases.part4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Задание 1. Группировка строк по первой букве
        List<String> strings = Arrays.asList("aa", "as", "dd", "df", "fgd", "rtrtr");
        Map<Character, List<String>> stringsGroup = strings.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        stringsGroup.forEach((letter, list) -> {
            System.out.println(letter + ": " + list);
        });

        //Задание 2. Группировка чисел по чётности
        List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 7, 8);
        Map<Boolean, List<Integer>> numbersGroup = numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0));
        System.out.println(numbersGroup.get(true));
        System.out.println(numbersGroup.get(false));

        //Задание 3. Поиск среднего значения чисел
        List<Integer> numbersAvg = Arrays.asList(1, 2, 4, 5, 7, 8);
        Double sum = numbersAvg.stream()
                .collect(Collectors.averagingInt(n -> n));
        System.out.println(sum);
    }
}