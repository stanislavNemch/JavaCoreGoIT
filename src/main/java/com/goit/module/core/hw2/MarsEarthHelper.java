package com.goit.module.core.hw2;

    /*
    * Task 33
    * Write a method public int convertAppleCount(float count)
    * that would accept a Martian number of apples and return a
    *  normal integer of type int.
    * --------------------------------
    * Task 34
    * Add the countAppleCount() method so that it returns the
    * sum of all apple trees on Mars.
    * --------------------------------
    * Task 35
    * Add the calculateTotalAppleWeight() method so that
    * it returns the predictable total weight of the apple.
    * */

public class MarsEarthHelper {

    public int convertAppleCount(float count) {
        return (int) count;
    }

    public byte countAppleCount(int garden1Count, int garden2Count) {
        int totalCount = garden1Count + garden2Count;
        return (byte) totalCount;
    }

    public float calculateTotalAppleWeight(double treeAge) {
        return (float) (treeAge * 9.18);
    }

    public static void main(String[] args) {
        MarsEarthHelper helper = new MarsEarthHelper();

        //Should be 10
        System.out.println("convertAppleCount(10f) = " + helper.convertAppleCount(10f));
        System.out.println("convertAppleCount(3.4f) = " + helper.convertAppleCount(3.4f));
        System.out.println("convertAppleCount(10.99f) = " + helper.convertAppleCount(10.99f));

        System.out.println("countAppleCount(10, 7) = " + helper.countAppleCount(10, 7));
        System.out.println("calculateTotalAppleWeight(1d) = " + helper.calculateTotalAppleWeight(1d));
    }
}
