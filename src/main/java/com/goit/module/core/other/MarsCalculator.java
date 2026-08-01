package com.goit.module.core.other;

public class MarsCalculator {
    public int sum(int a, int b, int c) {
        return a + b + c;
    }
    public int sub(int a, int b, int c) {
        return a - b - c;
    }
    public int multiply(int a, int b, int c) {
        return (sum(a, b, c) * sub(a, b, c));
    }
    public float divide(int a, int b, int c) {
        return ((float) sum(a, b, c) / 10);
    }

    public static void main(String[] args) {
        MarsCalculator calc = new MarsCalculator();
        System.out.println(calc.sum(1, 2, 3));
        System.out.println(calc.sub(1, 2, 3));
        System.out.println(calc.multiply(1, 2, 3));
        System.out.println(calc.divide(1, 2, 3));
    }
}
