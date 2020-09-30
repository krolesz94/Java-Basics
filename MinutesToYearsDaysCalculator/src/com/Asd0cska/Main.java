package com.Asd0cska;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println(INVALID_VALUE_MESSAGE);
        }else{
            long hours = minutes / 60;
            long remainingMinutes = minutes % 60;
            long days = hours / 24;
            long remainingHours = hours % 24;
            long years = days / 365;
            long remainingDays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }
}
