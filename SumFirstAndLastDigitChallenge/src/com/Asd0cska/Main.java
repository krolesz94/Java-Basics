package com.Asd0cska;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(101));
        System.out.println(sumFirstAndLastDigit(-101));
        System.out.println(sumFirstAndLastDigit(0));
    }

    public static int sumFirstAndLastDigit (int number) {

        int sum = 0;
        int firstDigit;

        if (number >= 0){
            firstDigit = Integer.parseInt(Integer.toString(number).substring(0, 1));
            sum = (number % 10) + firstDigit;
            return sum;
        }else{
            return -1;
        }
    }
}


/*
* last digit n % 10
* firstDigit = Integer.parseInt(Integer.toString(number).substring(0, 1));
* */
