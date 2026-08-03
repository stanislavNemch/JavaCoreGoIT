package com.goit.module.core.hw3;

import java.util.Arrays;
import java.util.Scanner;

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

    public int calculateNeededFuel(int distance) {
        if (distance <= 20) {
            return 1000;
        }
        return 1000 + (distance - 20) * 5;
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

    public void calculateMaxPower() {
        Scanner scanner = new Scanner(System.in);

        // 1. We read three engine power values
        float p1 = scanner.nextFloat();
        float p2 = scanner.nextFloat();
        float p3 = scanner.nextFloat();

        // 2. Find the maximum power among the three engines
        float maxPower = Math.max(p1, Math.max(p2, p3));

        // 3. Determine the coefficient based on the power
        float coefficient;
        if (maxPower < 10) {
            coefficient = 0.7f;
        } else if (maxPower >= 10 && maxPower <= 100) {
            coefficient = 1.2f;
        } else {
            coefficient = 2.1f;
        }

        // 4. Calculate and print the result
        float result = maxPower * coefficient;
        System.out.println(result);

        scanner.close();
    }

    public String getMyPrizes(int ticket) {

        String result = "";

        if (ticket % 10 == 0) result += "crystall ";
        if (ticket % 10 == 7) result += "chip ";
        if (ticket > 200) result += "coin ";

        return result.strip();
    }

    public boolean isHangarOk(int side1, int side2, int price) {

        int area = side1 * side2;

        if (area < 1500) {
            return false;
        }

        int longerSide = Math.max(side1, side2);
        int shorterSide = Math.min(side1, side2);

        if (longerSide > 2 * shorterSide) {
            return false;
        }

        return price <= area * 1000;
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
       // System.out.println(ship.roundSpeed(55));
       // System.out.println(ship.roundSpeed(10));
       // System.out.println(ship.roundSpeed(15));
       // System.out.println(ship.roundSpeed(89));

         // calculateNeededFuel
        // System.out.println("calculateNeededFuel(1): " + ship.calculateNeededFuel(1));   // 1000
        // System.out.println("calculateNeededFuel(20): " + ship.calculateNeededFuel(20));  // 1000
        // System.out.println("calculateNeededFuel(25): " + ship.calculateNeededFuel(25));  // 1025

         // calculateMaxPower — tests
         // Test 1: input 1 3 5 → expected output 3.5
         // Test 2: input 5 10 8 → expected output 12.0
         // ship.calculateMaxPower();

        //Should be "crystall coin"
        // System.out.println(ship.getMyPrizes(250));
        // System.out.println(ship.getMyPrizes(10));
        // System.out.println(ship.getMyPrizes(77));
        // System.out.println(ship.getMyPrizes(777));
        // System.out.println(ship.getMyPrizes(54));

        //Should be true
        System.out.println(ship.isHangarOk(100, 75, 1000000));
        //Should be false
        System.out.println(ship.isHangarOk(100, 20, 10000));
    }
}
