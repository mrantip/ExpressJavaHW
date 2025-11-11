package org.example.exceptionsgenerics.exceptions.checked;

import static org.example.exceptionsgenerics.exceptions.checked.CheckedException.openFile;

public class Main {
    public static void main(String[] args) {
        openFile("data.txt");
    }
}