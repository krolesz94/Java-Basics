package com.Asd0cska;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage () {

        Scanner sc = new Scanner(System.in);
        double avg = 0;
        int sum = 0;
        int counter = 0;

        while (true) {
            boolean isAnInt = sc.hasNextInt();

            if (isAnInt) {
                int number = sc.nextInt();
                counter++;
                sum += number;
            } else {
                break;
            }
        }

        if ((counter == 0) || (sum == 0)){
            avg = 0;
        } else {
            avg = (double) sum / counter;
        }

        System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
        sc.close();
    }
}
