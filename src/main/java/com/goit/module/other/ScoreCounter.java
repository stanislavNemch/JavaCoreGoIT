package com.goit.module.other;

public class ScoreCounter {
    public int addScore(int currentScore, int amount) {
        currentScore += amount;
        return currentScore;
    }

    public int twiceScore(int currentScore) {
        currentScore *= 2;
        return currentScore;
    }

    public static void main(String[] args) {
        ScoreCounter counter = new ScoreCounter();
        System.out.println("addScore(10, 5) = " + counter.addScore(10, 5));
        System.out.println("twiceScore(7) = " + counter.twiceScore(7));
    }
}
