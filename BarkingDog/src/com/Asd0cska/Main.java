package com.Asd0cska;

public class Main {

    public static void main(String[] args) {
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOFDay){
        if (barking == true && hourOFDay > 22 && hourOFDay <= 23){
            return true;
        }else if (barking == true && hourOFDay >= 0 && hourOFDay < 8){
            return true;
        }else{
            return false;
        }
    }
}
