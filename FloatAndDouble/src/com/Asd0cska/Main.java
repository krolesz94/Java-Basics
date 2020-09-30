package com.Asd0cska;

public class Main {

    public static void main(String[] args) {

        // width of Int = 32 (4 bytes)
        int myIntValue = 5 / 3;
        // width of Float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        // width of Double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double numPounds = 120d;
        double onePound = 0.45359237d;
        double kilograms = numPounds * onePound;
        System.out.println("120 pounds in kilograms is " + kilograms);

        double pi = Math.PI;
        System.out.println(pi);
    }
}
