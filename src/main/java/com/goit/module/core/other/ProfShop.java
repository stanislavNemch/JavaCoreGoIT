package com.goit.module.core.other;

public class ProfShop {
    public boolean isPriceOk(int price) {
        return price != 1000;
    }

    public float calculateRegularDiscountPrice(float price) {
        return price * 0.9f;
    }

    public boolean isDiscount50(int price) {
        // 4 units cost 1000, so 1 unit costs 1000 / 4 = 250
        return price == 250;
    }

    public boolean isPriceHappy(int price, int year, int day) {
        return price == year * day;
    }

    public static void main(String[] args) {
        ProfShop shop = new ProfShop();

        //isPriceOk
        System.out.println("shop.isPriceOk(100) = " + shop.isPriceOk(100)); //Should be true
        System.out.println("shop.isPriceOk(1000) = " + shop.isPriceOk(1000)); //Should be false

        //calculateRegularDiscountPrice
        System.out.println("shop.calculateRegularDiscountPrice(100f) = " + shop.calculateRegularDiscountPrice(100f)); //Should be 90.0

        //isDiscount50
        System.out.println("shop.isDiscount50(250) = " + shop.isDiscount50(250)); //Should be true
        System.out.println("shop.isDiscount50(200) = " + shop.isDiscount50(200)); //Should be false

        //isPriceHappy
        //2023 * 23 = 46529
        System.out.println("shop.isPriceHappy(46529, 2023, 23) = " + shop.isPriceHappy(46529, 2023, 23)); //Should be true
        System.out.println("shop.isPriceHappy(500, 2023, 23) = " + shop.isPriceHappy(500, 2023, 23)); //Should be false
    }
}
