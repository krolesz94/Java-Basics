package com.Asd0cska;

public class Main {

    public static void main(String[] args) {
        area(12);
        area(1, 2);
        area(1, 2);
    }

    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static double area(double radius) {
        if (radius < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return -1.0;
        } else {
            double cirleArea = radius * radius * Math.PI;
            System.out.println("The area of this circle is: " + cirleArea);
            return cirleArea;
        }
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return -1.0;
        } else {
            double rectangleArea = x * y;
            System.out.println("The area of this rectangle is: " + rectangleArea);
            return rectangleArea;
        }
    }
}