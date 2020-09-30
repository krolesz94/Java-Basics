package com.Asd0cska;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);


        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);


        displayHighScorePosition("Bob", calculateHighScorePosition(1500));
        displayHighScorePosition("Steve", calculateHighScorePosition(900));
        displayHighScorePosition("George", calculateHighScorePosition(400));
        displayHighScorePosition("Tom", calculateHighScorePosition(50));

    }



    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return  finalScore;
        }

        return  -1;
    }


    public static void displayHighScorePosition(String playerName,int highScorePosition){

        System.out.println(playerName + " managed to get into positions " + highScorePosition + " on the high score table");

    }

    public static int calculateHighScorePosition(int playerScore){

        if (playerScore >= 1000){
            return 1;
        }else if (playerScore >= 500){
            return 2;
        }else if (playerScore >= 100){
            return 3;
        }

        return 4;

    }
}
