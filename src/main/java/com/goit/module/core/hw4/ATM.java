package com.goit.module.core.hw4;

public class ATM {

    public int countBanknotes(int sum) {
        int[] banknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int count = 0;
        int index = 0;

        while (index < banknotes.length) {
            while (sum >= banknotes[index]) {
                sum -= banknotes[index];
                count++;
            }
            index++;
        }

        return count;
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println(atm.countBanknotes(500));
        System.out.println(atm.countBanknotes(578));
    }
}
