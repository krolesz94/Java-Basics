package com.Asd0cska;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Bob", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        //calcFeetAndInchesToCentimeters(12.5, 9.75);
        calcFeetAndInchesToCentimeters(156);
    }

    public static  int calculateScore(String playerMame, int score){
        System.out.println("Player " + playerMame + " scored " + score + " points");
        return score * 1000;
    }


    public static  int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static  int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inch){

        double centimeters = (feet * 12) *2.54;
        centimeters += inch * 2.54;
        if ((feet > 0) && (inch >= 0) && (inch <= 12)){
            System.out.println(feet + " feet, " + inch + " inches = " + centimeters + " cm");
            return centimeters;
        }else{
            System.out.println("Invalid feet or inches");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inch){

        if (inch >= 0 && inch <= 12){
            double feet = (int) inch / 12;
            double remaininggInches = (int) inch % 12;
            System.out.println(inch + " inches is equal to " + feet + " feet and " + remaininggInches + " inches");
            return calcFeetAndInchesToCentimeters(feet, remaininggInches);
        }else{
            return -1;
        }
    }

}
