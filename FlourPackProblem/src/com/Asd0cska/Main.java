package com.Asd0cska;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
    }

    public static boolean canPack (int bigCount, int smallCount, int goal) {

        int bigCountKilos = 0;

        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }else {
            for (int i = 0; i < bigCount; i++){
                if (((i + 1) * 5) <= goal) {
                    bigCountKilos += 5;
                } else {
                    break;
                }
            }

            if ((bigCountKilos + smallCount) >= goal) {
                return true;
            } else {
                return false;
            }
        }
    }
}
