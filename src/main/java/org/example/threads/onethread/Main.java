package org.example.threads.onethread;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new OneThread();
        t1.start();
    }
}