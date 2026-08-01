package com.goit.module.core.hw3;

import java.util.Arrays;

public class SaveStarShip {

    public int calculateDistance(int distance) {
        return Math.abs(distance);
    }

    public String[] getPlanetsModern(String galaxy) {
        return switch (galaxy) {
            case "Miaru" -> new String[]{"Maux", "Reux", "Piax"};
            case "Milkyway" -> new String[]{"Earth", "Mars", "Jupiter"};
            case "DangerBanger" -> new String[]{"Fobius", "Demius"};
            default -> new String[0];
        };
    }

    public String[] getPlanets(String galaxy) {
        if (galaxy.equals("Miaru")) {
            return new String[]{"Maux", "Reux", "Piax"};
        } else if (galaxy.equals("Milkyway")) {
            return new String[]{"Earth", "Mars", "Jupiter"};
        } else if (galaxy.equals("DangerBanger")) {
            return new String[]{"Fobius", "Demius"};
        } else {
            return new String[0];
        }
    }

    public String choosePlanet(long distanceToEarth) {
        return distanceToEarth < 45677 ? "Earth" : "Pern";
    }

    public int calculateFuelPrice(String fuel, int count) {

        int pricePerUnit = 0;

        switch (fuel) {
            case "STAR100":
                pricePerUnit = 70;
                break;
            case "STAR500":
                pricePerUnit = 120;
                break;
            case "STAR1000":
                pricePerUnit = 200;
                break;
            default:
                // Якщо бренд невідомий, ціна становить 50
                pricePerUnit = 50;
                break;
        }
        return pricePerUnit * count;
    }

    public int roundSpeed(int speed) {
        return (speed + 5) / 10 * 10;
    }

    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

       /*
            System.out.println(ship.calculateDistance(-15));
            System.out.println(ship.calculateDistance(10));
            System.out.println(ship.calculateDistance(-10));
        */

       // System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));
       // System.out.println(Arrays.toString(ship.getPlanets("Unknown")));

        //Modern Switch Expression
       // System.out.println(Arrays.toString(ship.getPlanetsModern("DangerBanger")));
       // System.out.println(Arrays.toString(ship.getPlanetsModern("Unknown")));

        //Should be Earth
       // System.out.println(ship.choosePlanet(10));
       // System.out.println(ship.choosePlanet(100000));

        //Should be 700
       // System.out.println(ship.calculateFuelPrice("STAR100", 10));
       // System.out.println(ship.calculateFuelPrice("STAR7", 5));

        //Should be 60
        System.out.println(ship.roundSpeed(55));
        System.out.println(ship.roundSpeed(10));
        System.out.println(ship.roundSpeed(15));
        System.out.println(ship.roundSpeed(89));
    }
}
