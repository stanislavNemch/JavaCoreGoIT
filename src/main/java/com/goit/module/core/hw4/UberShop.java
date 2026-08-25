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

    public int[] findMinMaxPrices(int[] prices) {

        if (prices == null || prices.length == 0) {
           return new int[0];
        }

        int min = prices[0];
        int max = prices[0];

        for (int price : prices) {
            if (price < min) {
                min = price;
            }
            if (price > max) {
                max = price;
            }
        }

        if (max == min) {
            return new int[]{min};
        }

        return new int[]{min, max};
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

        //Should be [3, 1550]
        System.out.println(Arrays.toString(shop.findMinMaxPrices(new int[] {10, 50, 3, 1550})));
        //Should be []
        System.out.println(Arrays.toString(shop.findMinMaxPrices(new int[] {})));
        //Should be [50]
        System.out.println(Arrays.toString(shop.findMinMaxPrices(new int[] {50, 50})));
    }
}