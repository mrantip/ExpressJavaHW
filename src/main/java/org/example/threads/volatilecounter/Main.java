package org.example.threads.volatilecounter;

public class Main {
    public static void main(String[] args) {
        InfiniteCounter infiniteCounter = new InfiniteCounter();
        Thread t1 = new Thread(infiniteCounter);

        System.out.println("Старт потока");
        t1.start();

        try {
            System.out.println("Ждем 2 секунды");
            Thread.sleep(2000);

            infiniteCounter.stop();
            System.out.println("Значение переменной stop изменено на true");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Значение счетчика равно " + infiniteCounter.getCounter());
    }
}