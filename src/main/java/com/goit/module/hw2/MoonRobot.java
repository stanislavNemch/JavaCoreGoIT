package com.goit.module.hw2;

public class MoonRobot {

    public boolean canOvercomeHole(int holeDepth, int batteryPercent) {
        return holeDepth < 34 || batteryPercent > 67;
    }

    public boolean canJumpOverHill(int hillHeight, int batteryPercent) {
        return hillHeight <= 150 || batteryPercent > 90;
    }

    public boolean areSensorsOk(boolean isEngineWorking, boolean isRobotStanding) {
        if (isRobotStanding && isEngineWorking) {
            return false;
        } return isRobotStanding || isEngineWorking;
    }

    public boolean shouldSleep(boolean isDayNow) {
        return !isDayNow;
    }

    //Test output
    public static void main(String[] args) {
        MoonRobot robot = new MoonRobot();

        //Should be false
        System.out.println("canOvercomeHole(50, 60) = " + robot.canOvercomeHole(50, 60));
        //Should be true
        System.out.println("canJumpOverHill(100, 90) = " + robot.canJumpOverHill(100, 90));
        //Should be false
        System.out.println("areSensorsOk(true, true) = " + robot.areSensorsOk(true, true));
        //Should be true
        System.out.println("areSensorsOk(false, true) = " + robot.areSensorsOk(false, true));
        //Should be false
        System.out.println("areSensorsOk(false, false) = " + robot.areSensorsOk(false, false));
        //Should be false
        System.out.println("shouldSleep(true) = " + robot.shouldSleep(true));
    }
}
