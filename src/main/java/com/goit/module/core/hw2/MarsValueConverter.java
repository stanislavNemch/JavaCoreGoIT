package com.goit.module.core.hw2;

public class MarsValueConverter {

    public int changeMoneyAmount(float startAmount, float toRemove){
        // Результат subtraction (startAmount - toRemove) має тип float.
        // Щоб повернути int, ми повинні явно використати (int).
        return (int) (startAmount - toRemove);
    }

    public byte calculateMoneySum(int sum1, int sum2){
        // Результат додавання має тип int.
        // Ми приводимо його до byte за допомогою (byte).
        return (byte) (sum1 + sum2);
    }

    public short halfOfMoney(double startMoney){
        // Результат ділення має тип double.
        // Ми приводимо його до short за допомогою (short).
        return (short) (startMoney / 2);
    }

    public static void main(String[] args) {
        MarsValueConverter converter = new MarsValueConverter();

        System.out.println("Test 1: " + converter.changeMoneyAmount(100f, 40.5f)); // Очікуємо 59
        System.out.println("Test 2: " + converter.calculateMoneySum(50, 40));      // Очікуємо 90
        System.out.println("Test 3: " + converter.halfOfMoney(1000.9999));       // Очікуємо 500
    }
}
