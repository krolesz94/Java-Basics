package com.Asd0cska;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        if (a > b){
            double c = a - b;
            if (c <= 0.0009){
                return true;
            }else{
                return  false;
            }
        }else{
            double c = b - a;
            if (c <= 0.0009){
                return true;
            }else{
                return false;
            }
        }
    }
}
