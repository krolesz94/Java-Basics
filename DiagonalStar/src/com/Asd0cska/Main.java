package com.Asd0cska;

public class Main {

    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static void printSquareStar(int number) {

        if (number < 5)
            System.out.println("Invalid Value");
        else {

            for (int r = 1; r <= number; r++) {

                for (int c = 1; c <= number; c++) {

                    if (c != number && (r == 1 || r == number || c == 1 || r == c || c == number - r + 1))
                        System.out.print("*");
                    else if (c == number)
                        System.out.println("*");
                    else System.out.print(" ");
                }
            }
        }
    }
}
