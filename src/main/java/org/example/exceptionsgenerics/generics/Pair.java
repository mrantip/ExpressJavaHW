package org.example.exceptionsgenerics.generics;

public class Pair<T, U> {
    private T first;
    private U second;

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public T getFirst() {
        return this.first;
    }

    public U getSecond() {
        return this.second;
    }
}