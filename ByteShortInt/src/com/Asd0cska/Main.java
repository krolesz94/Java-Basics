package com.Asd0cska;

public class Main {

    public static void main(String[] args) {

        //Integer has a with of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMaxValue/2);
        System.out.println("myTotal = " + myTotal);

        //Byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        //Short has a width of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue/2);
        System.out.println("myNewShortValue = " + myNewShortValue);

        //Long has a width of 64
        long myLongValue = 9_223_372_036_854_775_807L;
        long myNewLongValue = (long) (myLongValue/2);
        System.out.println("myNewLongValue = " + myNewLongValue);

        byte myChallengeByte = 64;
        short myChallengeShort = 18_365;
        int myChallengeInt = 1_000_000;
        long myChallengeTotal = 5000L + (10 * (myChallengeByte + myChallengeInt + myChallengeShort));
        System.out.println("myChallengeTotal = " + myChallengeTotal);
    }
}
