package com.hankzimmer;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(222222));
    }

    public static int sumDigits(int number) {

        int sumOfDigits = 0;
        if (number >= 10) {
            int nextDigit;
            int processedNumber = number;

            while (processedNumber >= 1){
                nextDigit = processedNumber % 10;
                System.out.println("The next digit is " + nextDigit);
                sumOfDigits += nextDigit;
                System.out.println("The current sum of digits is " + sumOfDigits);

                processedNumber = processedNumber/10;
                System.out.println("The processed number is now " + processedNumber);
            }
            return sumOfDigits;
        } else {
            return -1;
        }
    }
}
