package com.Asd0cska;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean hasTeen(int a, int b, int c){
        if (a >= 13 && a <= 19){
            return true;
        }else if(b >= 13 && b <= 19){
            return true;
        }else if(c >= 13 && c <= 19){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isTeen(int year){
        if (year <= 19 && year >= 13){
            return true;
        }else{
            return false;
        }
    }
}
