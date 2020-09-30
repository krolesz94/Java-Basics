package com.Asd0cska;

import java.awt.*;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        printArray(sortInteger(getInteger(5)));
    }

    public static int[] getInteger(int numbers){
        int [] integerArray = new int[numbers];
        System.out.println("Enter " + numbers + " integer values:\r");
        for (int i = 0; integerArray.length > i; i++){
            integerArray[i] += sc.nextInt();
        }
        return integerArray;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("The " + i + ".place contains the following value: " + array[i]);
        }
    }

    public static int[] sortInteger(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - 1; j++){
                if (array[j] < array[j + 1]) {
                    array[j] *= array[j + 1];
                    array[j + 1] = array[j] / array[j + 1];
                    array[j] /= array[j + 1];
                }
            }
        }
        return array;
    }
}
