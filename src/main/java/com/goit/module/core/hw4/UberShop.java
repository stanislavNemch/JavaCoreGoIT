package com.goit.module.core.hw4;

import java.util.Arrays;

public class UberShop {
    public void printPrices(float[] prices) {
        for (float price : prices) {
            System.out.println(price + " jup.");
        }
    }
    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < 1000f) {
                // цена меньше 1000 -> х2
                prices[i] = prices[i] * 2f;
            } else {
                // цена >= 1000 -> х1.5
                prices[i] = prices[i] * 1.5f;
            }
        }
    }


    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 100 jup. 23.5 jup. 400 jup. - one price per line
        float[] prices = new float[] {100f, 23.5f, 400f};
        shop.printPrices(prices);

        //Should be [200, 2250]
        float[] pricesTwo = new float[] {100f, 1500f};
        shop.multiplyPrices(pricesTwo);
        System.out.println(Arrays.toString(pricesTwo));
    }
}