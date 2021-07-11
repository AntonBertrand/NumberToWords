package com.company;

public class Main {

    public static void main(String[] args) {
        numberToWords(0);
    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int originalNum = number;

        number = reverse(number);
        int reverseNumCopy = number;

        if (number == 0) {
            System.out.println("Zero");
        }


        while (number != 0) {


            int lastDigit = number % 10;

            //2
            switch (lastDigit) {
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
            number = number / 10;
        }

        if ((getDigitCount(number)) != (getDigitCount(originalNum))) ;
        {
            int difference = ((getDigitCount(originalNum)) - (getDigitCount(reverseNumCopy)));

            for (int i = 0; i != difference; i++) {
                System.out.println("Zero");
            }
        }

    }

    public static int reverse(int number) {

        int reversedNumber = 0;

        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number = number / 10;
        }

        return reversedNumber;

    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;


        for (int i = 1; number != 0; i++) {
            number /= 10;

            if (number == 0) {
                count = i;

            }

        }


        return count;

    }


}
