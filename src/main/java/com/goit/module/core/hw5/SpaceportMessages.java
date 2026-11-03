package com.goit.module.core.hw5;

public class SpaceportMessages {

    public static String generateLandingMessage(String shipName, String spaceport, String time) {
        return "Spaceship " + shipName + " landing at " + spaceport + ", time is " + time;
    }

    public static void main(String[] args) {
        System.out.println(SpaceportMessages.generateLandingMessage("SunFlower", "EarthKeeper", "20:40"));

        String shipName = "SunFlower";
        String spaceport = "EarthKeeper";
        String time = "20:40";
        String landingMessage = SpaceportMessages.generateLandingMessage(shipName, spaceport, time);
        System.out.println(landingMessage);
    }
}
