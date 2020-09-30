package com.Asd0cska;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sm of the digits in number 125 is " + sumDigits(125));
        System.out.println("The sm of the digits in number -125 is " + sumDigits(-125));
        System.out.println("The sm of the digits in number 1251 is " + sumDigits(1251));
        System.out.println("The sm of the digits in number 12512 is " + sumDigits(12512));
        System.out.println("The sm of the digits in number 5 is " + sumDigits(5));
        System.out.println("The sm of the digits in number 125125 is " + sumDigits(125125));
    }

    public static int sumDigits (int number) {

        int sum = 0;

        if (number >= 10){
            while (number > 0){
                sum += number % 10;
                number /= 10;
            }
            return sum;
        }else{
            return -1;
        }
    }
}



/*
* Use n % 10 to extract the least-significant digit
* Use n = n / 10 to discard the least-significant digit
* The method need to be static like other methods so far in the course
* */
