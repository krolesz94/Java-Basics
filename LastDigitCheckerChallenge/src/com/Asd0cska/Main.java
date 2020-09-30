package com.Asd0cska;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));

        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit (int a, int b, int c) {

        int leftA = a % 10;
        int leftB = b % 10;
        int leftC = c % 10;

        if (!isValid(a) || !isValid(b) || !isValid(c)){
            return false;
        }else{
            if ((leftA == leftB) || (leftA == leftC) || (leftB == leftC)){
                return true;
            }else{
                return false;
            }
        }
    }

    public static boolean isValid (int number) {
        if ((number < 10) || (number > 1000)){
            return false;
        }else {
            return true;
        }
    }
}
