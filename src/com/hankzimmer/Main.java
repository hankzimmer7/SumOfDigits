package com.hankzimmer;

public class Main {

    public static void main(String[] args) {
        // example inputs
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(22591));
        System.out.println(sumDigits(999999999));
        System.out.println(sumDigits(-20));
    }

    //returns the sum of the digits
    private static int sumDigits(int number) {
        //The input must be positive
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int nextDigit;
        //Continue combining digits until the last digit is combined (and number will be 0)
        while (number > 0) {
            nextDigit = number % 10;
            sum += nextDigit;
            number /= 10;
        }
        return sum;
    }
}
