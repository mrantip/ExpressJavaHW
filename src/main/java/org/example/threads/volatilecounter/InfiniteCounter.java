package org.example.threads.volatilecounter;

public class InfiniteCounter implements Runnable {
    private volatile boolean stop = false;
    private int counter = 0;

    @Override
    public void run() {
        while (!stop) {
            this.counter++;
        }
    }

    public void stop() {
        this.stop = true;
    }

    public int getCounter() {
        return this.counter;
    }
}