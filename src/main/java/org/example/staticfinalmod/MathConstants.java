package org.example.staticfinalmod;

public class MathConstants {

    final static double PI = 3.14159;
    final static double E = 2.71828;

    public static void calculateCircleArea(double r) {
        System.out.println("Площадь круга " + PI * (r * r));
    }

    public static void calculateCircumference(double r) {
        System.out.println("Окружность круга" + 2 * PI * r);
    }
}
