package com.Asd0cska;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        for (int i = 1; i < 1000; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.print(i + " | ");
                sum += i;
                count++;
                if (count == 5){
                    System.out.println("\nThe first five numbers sum which can be divided with 3 and 5 is: " + sum);
                    break;
                }
            }
        }
    }
}
