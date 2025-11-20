package org.example.threads.onethread;

public class OneThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Привет из потока! (" + i + " из 5)");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}