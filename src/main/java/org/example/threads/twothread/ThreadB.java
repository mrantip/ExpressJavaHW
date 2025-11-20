package org.example.threads.twothread;

public class ThreadB extends Thread{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("B (" + i + " из 5)");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}