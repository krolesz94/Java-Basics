package com.Asd0cska;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = readInteger(5);
        System.out.println("The content of the Array[]: " + Arrays.toString(array));
        System.out.println("The minimum value of the array is: " + findMin(array));
    }

    public static int[] readInteger(int count){
        int[] array = new int[count];
        System.out.println("Enter " + count + " number: ");

        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
