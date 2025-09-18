package org.example.firstclasscreation;

public class Point {

    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int newX) {
        this.x = newX;
    }

    public void print() {
        System.out.println("X: " + this.x + ", Y: " + this.y);
    }
}
