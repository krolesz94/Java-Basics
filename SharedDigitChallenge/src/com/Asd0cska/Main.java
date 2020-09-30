package com.Asd0cska;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit (int numberOne, int numberTwo) {

        int remainderNumberOneLeft, remainderNumberOneRight;
        int remainderNumberTwoLeft, remainderNumberTwoRight;

        if ((numberOne < 10) || (numberOne > 99) || (numberTwo > 99) || (numberTwo < 10)){
            return false;
        }else{
            remainderNumberOneLeft = numberOne / 10;
            remainderNumberOneRight = numberOne % 10;
            remainderNumberTwoLeft = numberTwo / 10;
            remainderNumberTwoRight = numberTwo % 10;

            if ((remainderNumberOneLeft == remainderNumberTwoLeft)
                    || (remainderNumberOneLeft == remainderNumberOneRight)
                    | (remainderNumberOneRight == remainderNumberTwoLeft)
                    || (remainderNumberOneRight == remainderNumberTwoRight)){
                return true;
            }else{
                return false;
            }
        }
    }
}
