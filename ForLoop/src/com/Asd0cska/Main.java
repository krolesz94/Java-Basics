package com.Asd0cska;

public class Main {

    public static void main(String[] args) {
//        System.out.println("10,000 at 2% interest = " + calculatedInterest(10000,2.0));
//        System.out.println("10,000 at 3% interest = " + calculatedInterest(10000,3.0));
//        System.out.println("10,000 at 4% interest = " + calculatedInterest(10000,4.0));
//        System.out.println("10,000 at 5% interest = " + calculatedInterest(10000,5.0));

        for (int i = 2; i <= 8; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculatedInterest(10000, i)));
        }

        System.out.println("\n");

        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculatedInterest(10000, i)));
        }

        System.out.println("\n\n");

        int count = 0;
        int range = 100;

        System.out.print("Prime numbers are: ");

        for (int i = 0; i <= range; i++) {
//            range++;
            if (isPrime(i)){
                System.out.print(i + " | ");
                count++;
            }

//            if (count == 3){
//                System.out.println("The prime count is reached 3!");
//                break;
//            }
        }
        System.out.println("\nThe prime count is: " + count);
    }

    public static double calculatedInterest(float  amount, float  interestRate){
        return (amount * (interestRate/100));
    }

    public static  boolean isPrime(int n){
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
