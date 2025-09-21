package org.example.staticfinalmod;

public class LibraryTest {

    public static void main(String[] args) {

        Library library = new Library();
        //поле bookTitle - нет доступа, т.к. поле private
//        library.bookTitle;

        //поле author - доступ есть, т.к. поле protected доступно в одном пакете
        library.author = "Tolstoi";

        //поле year - доступ есть, т.к. поле default доступно в одном пакете
        library.year = 1990;

        //доступ category - доступ есть, т.к. поле public доступно во всех пакетах программы
        library.category = "Action";
    }
}
