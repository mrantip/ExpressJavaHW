package org.example.exceptionsgenerics.exceptions.checked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void openFile(String file) {
        try {
            FileReader fileReader = new FileReader(file);
            System.out.println("Файл открыт");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}