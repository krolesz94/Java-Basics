package com.Asd0cska;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println("***Original Array***");
        System.out.println(Arrays.toString(myArray));

        System.out.println("***Reversed Array***");
        reverse(myArray);
    }

    public static void reverse(int[] array){

        for (int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
