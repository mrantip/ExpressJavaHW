package org.example.threads.synchronizedcounter;

public class Counter {
    private int count = 0;

    public synchronized void increment() {
        this.count++;
    }

    public synchronized int getCount() {
        return this.count;
    }
}