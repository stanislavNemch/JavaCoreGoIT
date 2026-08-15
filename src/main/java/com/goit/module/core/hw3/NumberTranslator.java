package com.goit.module.core.hw3;

public class NumberTranslator {

    public int translateExpression(String romanNumber) {
        String normalized = romanNumber.replace(" ", "").toUpperCase();

        return switch (normalized) {
            case "I" -> 1;
            case "II" -> 2;
            case "III" -> 3;
            case "IV" -> 4;
            case "V" -> 5;
            case "VI" -> 6;
            case "VII" -> 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            case "XI" -> 11;
            case "XII" -> 12;
            default -> -1;
        };
    }

    public int translate(String romanNumber) {
        String normalized = romanNumber.replace(" ", "").toUpperCase();

        switch (normalized) {
            case "I":    return 1;
            case "II":   return 2;
            case "III":  return 3;
            case "IV":   return 4;
            case "V":    return 5;
            case "VI":   return 6;
            case "VII":  return 7;
            case "VIII": return 8;
            case "IX":   return 9;
            case "X":    return 10;
            case "XI":   return 11;
            case "XII":  return 12;
            default:     return -1;
        }
    }

    public static void main(String[] args) {
        NumberTranslator translator = new NumberTranslator();
        System.out.println("Switch expression:");

        System.out.println(translator.translateExpression("I")); // 1
        System.out.println(translator.translateExpression(" X I")); // 11
        System.out.println(translator.translateExpression("iX ")); // 9
        System.out.println(translator.translateExpression("XX")); // -1

        System.out.println("Switch statement:");
        System.out.println(translator.translate("I")); // 1
        System.out.println(translator.translate(" X I")); // 11
        System.out.println(translator.translate("iX ")); // 9
        System.out.println(translator.translate("XX")); // -1
    }
}
