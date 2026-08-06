package com.goit.module.core.hw3;

public class CaptainDisputeAgain {

    public int findMin(int[] triple) {
        return Math.min(triple[0], Math.min(triple[1], triple[2]));
    }

    public static void main(String[] args) {
        CaptainDisputeAgain captainDisputeAgain = new CaptainDisputeAgain();
        int[] tripleOne = {1, 10, 3};
        System.out.println(captainDisputeAgain.findMin(tripleOne));
        int[] tripleSecond = {50, 4, 100};
        System.out.println(captainDisputeAgain.findMin(tripleSecond));
    }
}
