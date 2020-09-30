package com.Asd0cska;

public class Main {

    public static void main(String[] args) {

//        int value = 3;
//
//        if(value == 1){
//            System.out.println("Value was 1");
//        }else if (value == 2){
//            System.out.println("Value was 2");
//        }else{
//            System.out.println("Value not 1 or 2");
//        }

        int switchValue = 3;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Value not 1, 2, 3, 4 or 5");
        }

        char letter = 'F';

        switch (letter){
            case 'A':
                System.out.println("Char was " + letter);
                break;
            case 'B':
                System.out.println("Char was " + letter);
                break;
            case 'C':
                System.out.println("Char was " + letter);
                break;
            case 'D':
                System.out.println("Char was " + letter);
                break;
            case 'E':
                System.out.println("Char was " + letter);
                break;
            default:
                System.out.println(letter + " was not found!");
        }

        String switchMonth = "january";

        switch (switchMonth.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }


    }
}
