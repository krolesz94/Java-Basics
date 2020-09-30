package com.Asd0cska;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum (int number) {

        int sum = 0;
        int digit;

        if (number >= 0) {

            while (number > 0){
                digit = number % 10;

                if (digit % 2 == 0){
                    sum += digit;
                }

                number /= 10;
            }

            return sum;
        }else {
            return -1;
        }
    }

}
