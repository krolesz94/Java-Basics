package com.Asd0cska;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true){
            int order = counter +1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = sc.hasNextInt();

            if (isAnInt) {
                int number = sc.nextInt();

                counter++;

                if (number < min)
                    min = number;
                if (number > max)
                    max = number;

            } else {
                break;

            }
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        sc.close();

    }
}
