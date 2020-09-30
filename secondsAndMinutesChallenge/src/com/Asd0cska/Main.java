package com.Asd0cska;

public class Main {

    public static void main(String[] args) {
        getDurationString(61, 0);
        getDurationString(9_223_372_036_854_775_807L);
    }

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void getDurationString(long minutes, long seconds){
        long hours = minutes / 60;
        minutes = minutes % 60;
        if (minutes >= 0 && ((seconds >=0) && (seconds <= 59))){
            System.out.println(hours + "h " + minutes + "m " + seconds + "s");
        }else{
            System.out.println(INVALID_VALUE_MESSAGE);
        }
    }

    public static void getDurationString(long seconds){
        if (seconds >= 0){
            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;
            long hours = minutes / 60;
            long remainingMinutes = minutes % 60;
            long day = hours / 24;
            long remainingHours = hours % 24;
            long week = day / 7;
            long remainingDay = day % 7;
            long month = week / 30;
            long remainingWeek = week % 30;
            long year = month / 12;
            long remainingMonth = month % 12;
            long century = year / 100;
            long remainingYear = year % 100;
            long millenium = century / 10;
            long remainingCentury = century % 10;
            System.out.println(millenium + "m " + remainingCentury + "c " + remainingYear + "y " + remainingMonth + "m " + remainingWeek + "w " + remainingDay + "d " + remainingHours + "h " + remainingMinutes + "m " + remainingSeconds + "s");
        }else{
            System.out.println(INVALID_VALUE_MESSAGE);
        }
    }
}
