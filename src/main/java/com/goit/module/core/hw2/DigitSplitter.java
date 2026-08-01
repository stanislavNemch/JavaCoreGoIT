package com.goit.module.core.hw2;

public class DigitSplitter {

    public int getFirstDigit(int number) {
        while (number >= 10) {
            number /= 10;
        }
        return number;
    }

    public int getSecondDigit(int number) {
        while (number >= 100) {
            number /= 10;
        }
        return number % 10;
    }

    public static void main(String[] args) {
        DigitSplitter splitter = new DigitSplitter();
        System.out.println("First digit of 15: " + splitter.getFirstDigit(15));
        System.out.println("Second digit of 15: " + splitter.getSecondDigit(15));
    }
}
