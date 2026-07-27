package com.goit.module.hw3;

import java.util.Arrays;

public class HarekCity {

    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[] {age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String firstAndLastTogether(String[] names) {
        return names[0] + " AND " + names[names.length - 1] + " TOGETHER";
    }

    public String[] changeElectResult(String[] results) {
        if (results.length <= 1) {
            return results;
        }
        String temp = results[0];
        results[0] = results[results.length - 1];
        results[results.length - 1] = temp;
        return results;
    }

    public String[] changeElectResultAgain(String[] results) {
        return Arrays.copyOfRange(results, 2, 5);
    }

    public static void main(String[] args) {
        // String[] arr = new HarekCity().createEmptyNameArray();
        // System.out.println(Arrays.toString(arr));

        // int[] ageArray = new HarekCity().createAgeArray(10, 20, 30, 40);
        // System.out.println(Arrays.toString(ageArray));

        // String[] names = new String[]{"mixa", "ukio", "barek", "krou", "fiha"};
        // String[] toReplace = new String[]{"lopr", "boki"};
        // new HarekCity().fixNames(names, toReplace);
        // System.out.println(Arrays.toString(names));

        // String[] names = new String[]{"io", "pu", "re", "max", "kok", "mis", "hit", "kio", "pax", "rew"};
        // System.out.println(new HarekCity().firstAndLastTogether(names));

       // String[] results = new String[]{"miho", "hut"};
       // new HarekCity().changeElectResult(results);
       // System.out.println(Arrays.toString(results));

        String[] results = new String[]{"mix", "max", "pex", "fux", "rox"};
        String[] changedResults = new HarekCity().changeElectResultAgain(results);
        System.out.println(Arrays.toString(changedResults));
    }
}
