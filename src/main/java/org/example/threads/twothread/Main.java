package org.example.threads.twothread;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new ThreadA();
        Thread t2 = new ThreadB();

        t1.start();
        t2.start();
    }
}