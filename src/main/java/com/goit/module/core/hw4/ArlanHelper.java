package com.goit.module.core.hw4;

public class ArlanHelper {

    public String drawQuad(int n) {
        int i = 0;

        StringBuilder sb = new StringBuilder();
        while (i < n) {
            int j = 0;
            while (j < n) {
                sb.append("*");
                j++;
            }
            sb.append("\n");
            i++;
        }
        return sb.toString();
    }

    public String drawRect(int width, int height, char c) {
        int i = 0;

        StringBuilder sb = new StringBuilder();
        while (i < height) {
            int j = 0;
            while (j < width) {
                sb.append(c);
                j++;
            }
            sb.append("\n");
            i++;
        }
        return sb.toString();
    }

    public String drawLine(int length) {
        int i = 0;

        StringBuilder sb = new StringBuilder();
        while (i < length) {
            if (i % 2 != 0) {
                sb.append("*");
            } else {
                sb.append("#");
            }
            i++;
        }
        return sb.toString();
    }

    public String drawPattern(char[] pattern, int repeatCount) {

        if (pattern == null || pattern.length == 0 || repeatCount <= 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        int repeatIndex = 0;
        while (repeatIndex < repeatCount) {

            // Скидання індексу для кожного нового проходу по масиву
            int charIndex = 0;
            while (charIndex < pattern.length) {
                sb.append(pattern[charIndex]);
                charIndex++; // Крок внутрішнього циклу
            }

            repeatIndex++; // Крок зовнішнього циклу
        }

        return sb.toString();
    }

    //Test output
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //**
        //**
        System.out.println(helper.drawQuad(2));

        //Should be:
        //XX
        //XX
        //XX
        System.out.println(helper.drawRect(2, 3, 'X'));
        System.out.println(helper.drawRect(4, 3, 'Y'));
        System.out.println(helper.drawLine(5));
        System.out.println(helper.drawLine(12));
        System.out.println(helper.drawLine(11));
        System.out.println(helper.drawPattern(new char[] {'J', 'a', 'v', 'a'}, 3));
    }
}
