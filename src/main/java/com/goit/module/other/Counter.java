package com.goit.module.other;

public class Counter {
    public long current(long number) {
        return number;
    }

    public long next(long number) {
        return ++number;
    }

    public long prev(long number) {
        return --number;
    }

    public static void main(String[] args) {

        Counter counter = new Counter();
        System.out.println(counter.current(5));
        System.out.println(counter.next(5));
        System.out.println(counter.prev(5));
    }
}
