package com.Asd0cska;

import java.util.IllegalFormatCodePointException;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    private static final String IVALID_VALUE_MESSAGE = "Invalid Value";

    public static boolean isCatPlaying(boolean summer, int temperature){
        if ((summer && (temperature >= 25 && temperature <= 45)) || (!summer && (temperature >= 25 && temperature <= 35))){
            return true;
        }else{
            return false;
        }
    }
}
