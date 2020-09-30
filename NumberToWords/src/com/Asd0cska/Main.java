package com.Asd0cska;

public class Main {

    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);

        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
    }

    public static void numberToWords (int number) {

        if (number < 0){
            System.out.println("Invalid Value");
        }

        int digits = getDigitCount(number);

        int no = 0;
        number = reverse(number);

        for (int i = 0; i < digits; i++) {
            no = number % 10;
            number /= 10;

            switch (no) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }

    }

    public static int reverse(int number) {

        boolean neg = false;

        if(number < 0){
            neg = true;
            number *= -1;
        }
        int x;
        int y;
        int z = 0;
        int digits = getDigitCount(number) - 1;

        for (int i = digits; i >= 0; i--) {
            x = number % 10;
            y = x * (int) (Math.pow(10, i));
            number /= 10;
            z += y;
        }
        if (neg){
            z *= -1;
            return z;
        }
        return z;
    }

    public static int getDigitCount (int number) {

        if (number == 0) {
            int digits = 1;
            return digits;
        } else if (number < 0) {
            return -1;
        } else {
            int digits = 0;

            while (number != 0) {
                number /= 10;
                digits += 1;
            }
            return digits;
        }
    }
}
