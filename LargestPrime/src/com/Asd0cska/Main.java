package com.Asd0cska;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime (int number) {

        int largestPrime = 0;

        if (number <= 1) {
            return -1;
        } else {

            for (largestPrime = 2; largestPrime <= number; largestPrime++) {
                if (number % largestPrime == 0) {
                    number /= largestPrime;
                    largestPrime--;
                }
            }

            return largestPrime;
        }
    }
}
