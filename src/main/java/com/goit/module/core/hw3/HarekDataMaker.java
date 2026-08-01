package com.goit.module.core.hw3;

import java.util.Arrays;

public class HarekDataMaker {

    public String aggregateSingle(String name, String age, String planet) {
        return String.format("name - %s, age - %s, planet - %s", name, age, planet);
    }

    public String[] aggregateAll(String[] names, int[] ages, String[] planets) {
        String[] result = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            result[i] = aggregateSingle(names[i], Integer.toString(ages[i]), planets[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] names = new String[] {"hter", "pou", "diz"};
        int[] ages = new int[] {30, 35, 70};
        String[] planets = new String[] {"Mars", "Earth", "Jupiter"};

        HarekDataMaker harekDataMaker = new HarekDataMaker();

        System.out.println(harekDataMaker.aggregateSingle(names[0], Integer.toString(ages[0]), planets[0]));
        System.out.println("###");

        System.out.println(Arrays.toString(harekDataMaker.aggregateAll(names, ages, planets)));
    }
}
