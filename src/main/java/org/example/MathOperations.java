package org.example;

public class MathOperations {

    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public double divide(int x, int y) {
        return x / (double) y;
    }

    public int findMax(int a, int b) {
        return Math.max(a, b);
    }

    public int difference(int x, int y) {
        return Math.abs(x - y);
    }

    public int squareArea(int side) {
        return side * side;
    }

    public int squarePerimeter(int side) {
        return 4 * side;
    }

    public double convertSecondsToMinutes(int seconds) {
        return (double) seconds / 60;
    }

    public double averageSpeed(double distance, double time) {
        double speed;
        if (time == 0) {
            speed = 0;
        } else {
            speed = distance / time;
        }
        return speed;
    }

    public double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public double circleCircumference(double radius) {
        return 2 * Math.PI + radius;
    }

    public double calculatePercentage(double total, double part) {
        double result = 0;
        if (total > 0) {
            result = part / total * 100;
        }
        return result;
    }

    public double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}