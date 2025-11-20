package org.example.functionalinterfases.part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Задание 1. Фильтрация строк по длине больше 5
        List<String> strings = Arrays.asList("1", "22", "55555", "666666", "7777777");
        List<String> stringsStream = strings.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());
        System.out.println(stringsStream);

        //Задание 2. Фильтрация чисел, кратных 5
        List<Integer> numbers = Arrays.asList(1, 2, 5, 7, 10, 25);
        List<Integer> numbersDivided = numbers.stream()
                .filter(n -> n % 5 == 0)
                .toList();
        System.out.println(numbersDivided);

        //Задание 3. Преобразование строк в их длины
        List<String> stringsLength = Arrays.asList("1", "22", "55555", "666666", "7777777");
        List<Integer> stringsLengthInt = stringsLength.stream()
                .map(s -> s.length())
                .toList();
        System.out.println(stringsLengthInt);

        //Задание 4. Создание списка квадратов чисел
        List<Integer> numbersSquare = Arrays.asList(1, 2, 5, 7, 10, 25);
        List<Integer> numbersSquareStream = numbersSquare.stream()
                .map(n -> n * n)
                .toList();
        System.out.println(numbersSquareStream);

        //Задание 5. Удаление дубликатов из списка
        List<Integer> numbersUnique = Arrays.asList(1, 1, 2, 2, 3, 5, 6, 6);
        List<Integer> numbersUniqueStream = numbersUnique.stream()
                .distinct().toList();
        System.out.println(numbersUniqueStream);
    }
}