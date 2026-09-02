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

    public int getMinPriceCount(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int min = prices[0];
        int count = 1;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                count = 1;
            } else if (prices[i] == min) {
                count++;
            }
        }

        return count;
    }

    public int[] removePrice(int[] prices, int toRemove) {
        if (prices == null || prices.length == 0) {
            return new int[0];
        }

        int remainingCount = 0;
        for (int price : prices) {
            if (price != toRemove) {
                remainingCount++;
            }
        }

        int[] result = new int[remainingCount];

        int targetIndex = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] != toRemove) {
                result[targetIndex] = prices[i];
                targetIndex++;
            }
        }

        return result;
    }

    public int[] leavePrice9(int[] prices) {
        if (prices == null || prices.length == 0) {
            return new int[0];
        }

        int remainingCount = 0;
        for (int price : prices) {
            if (price % 10 == 9) {
                remainingCount++;
            }
        }

        int[] result = new int[remainingCount];

        int targetIndex = 0;
        for (int price : prices) {
            if (price % 10 == 9) {
                result[targetIndex] = price;
                targetIndex++;
            }
        }

        return result;
    }

    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {

        String[] safeShowcase = showcaseStocks == null ? new String[0] : showcaseStocks;
        String[] safeWarehouse = warehouseStocks == null ? new String[0] : warehouseStocks;

        String[] result = new String[safeShowcase.length + safeWarehouse.length];

        // Копіювання елементів з вітрини
        for (int i = 0; i < safeShowcase.length; i++) {
            result[i] = safeShowcase[i];
        }

        // Копіювання елементів зі складу
        for (int i = 0; i < safeWarehouse.length; i++) {
            result[safeShowcase.length + i] = safeWarehouse[i];
        }

        return result;
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

        System.out.println("Програма, яка повертає кількість мінімальних цін із переданого масиву.");
        System.out.println("Кількість мінімальних цін: " + shop.getMinPriceCount(new int[] {}));
        System.out.println("Кількість мінімальних цін: " + shop.getMinPriceCount(new int[] {5, 5, 5}));
        System.out.println("Кількість мінімальних цін: " + shop.getMinPriceCount(new int[] {5, 10, 15, 3, 5}));

        System.out.println("Видаляє всі входження ціни toRemove з масиву prices");
        System.out.println(Arrays.toString(shop.removePrice(new int[] {}, 0)));
        System.out.println(Arrays.toString(shop.removePrice(new int[] {150, 100, 200}, 100)));
        System.out.println(Arrays.toString(shop.removePrice(new int[] {100, 100, 100}, 100)));

        System.out.println("Правильна ціна на Чорну П'ятницю – це ціна, яка має останню цифру 9");
        System.out.println(Arrays.toString(shop.leavePrice9(new int[] {})));
        System.out.println(Arrays.toString(shop.leavePrice9(new int[] {1, 99, 5, 49})));

        System.out.println("Метод, який єднає два списки товарів.");
        //Якщо оба массива length == 0
        System.out.println("Фінальний перелік товарів, коли {}/{}: " + Arrays.toString(shop.mergeStocks(new String[] {}, new String[] {})));
        //Якщо оба заповнені
        System.out.println("Фінальний перелік товарів, коли {\"gun\", \"bow\"}/{\"firegun\"}: " + Arrays.toString(shop.mergeStocks(new String[] {"gun", "bow"}, new String[] {"firegun"})));
        //Якщо перший null, другий заповнений
        System.out.println("Фінальний перелік товарів, коли null/{\"firegun\"}: " + Arrays.toString(shop.mergeStocks(null, new String[] {"firegun"})));
        //Якщо другий null, перший заповнений
        System.out.println("Фінальний перелік товарів, коли {\"gun\", \"bow\"}/null: " + Arrays.toString(shop.mergeStocks(new String[] {"gun", "bow"}, null)));
        //Якщо оба null
        System.out.println("Фінальний перелік товарів, коли null/null: " + Arrays.toString(shop.mergeStocks(null, null)));
        //Якщо перший пустий, другий заповнений
        System.out.println("Фінальний перелік товарів, коли {} / {\"firegun\"}: " + Arrays.toString(shop.mergeStocks(new String[] {}, new String[] {"firegun"})));
        //Якщо оба массива заповнені
        System.out.println("Фінальний перелік товарів, коли {\"Avrocak\", \"Saw\", \"hywib\", \"naxyhekya\", \"du\"} / {\"Iq\", \"ta\", \"uzj\", \"Kohauwq\", \"sa\"}: " + Arrays.toString(shop.mergeStocks(new String[] {"Avrocak", "Saw", "hywib", "naxyhekya", "du"},
                new String[] {"Iq", "ta", "uzj", "Kohauwq", "sa"})));
    }
}