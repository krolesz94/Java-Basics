package com.Asd0cska;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result -= 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result *= 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result /= 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result %= 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result += 1;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an Alien!");
        else
            System.out.println("It is an Alien!");

        int topScore = 80;
        if (topScore != 100)
            System.out.println("You got the high score");

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less then 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One fo these tests is true");

        int newValue = 15;
        if (newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if (isCar = true)
            System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");


        double challengeValue = 20;
        double secondChallengeValue = 80;
        double challengeResult = (challengeValue + secondChallengeValue) * 25;
        double theRemainder = challengeValue % 40;
        System.out.println("theReminder = " + theRemainder);
        if (theRemainder <= 20)
            System.out.println("Total was over the limit");
    }
}
