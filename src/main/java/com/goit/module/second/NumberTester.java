package com.goit.module.second;

class NumberTester {
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isOdd(int number) {
        return number % 2 != 0;
    }

    //Test output
    public static void main(String[] args) {
        NumberTester tester = new NumberTester();
        System.out.println(tester.isEven(10)); //Should be true
        System.out.println(tester.isOdd(10)); //Should be false
    }
}
