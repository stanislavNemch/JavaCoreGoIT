package com.goit.billing;

public class SecurityDemo {

    // Метод демонструє критичну вразливість переповнення типів даних (Integer Overflow)
    public static void demonstrateOverflow() {
        System.out.println("=== Тест 1: Переповнення цілих чисел ===");

        int maxBalance = 2147483647; // Максимум для int
        System.out.println("Початковий баланс: " + maxBalance);

        // Імітація атаки або помилки: додаємо всього 1 одиницю
        int balanceAfterAttack = maxBalance + 1;
        System.out.println("Баланс після переповнення: " + balanceAfterAttack);
        // Виведе: -2147483648 (Гроші перетворилися на борг!)
    }

    // Метод показує, як уникнути переповнення за допомогою вбудованого класу Math
    public static void safeAddition() {
        System.out.println("\n=== Тест 2: Захист від переповнення ===");
        int maxBalance = 2147483647;

        try {
            // Клас Math під капотом перевіряє межі перед обчисленням
            int safeBalance = Math.addExact(maxBalance, 1);
            System.out.println("Результат: " + safeBalance);
        } catch (ArithmeticException e) {
            System.out.println("Блокування: Виявлено спробу зламу або критичну помилку переповнення!");
        }
    }

    // Метод демонструє небезпеку обчислення грошей у типі double (Floating-Point Inaccuracy)
    public static void demonstrateFloatingPointInaccuracy() {
        System.out.println("\n=== Тест 3: Втрата точності з типом double ===");

        double itemPrice = 0.1;
        double taxAmount = 0.2;
        double totalAmount = itemPrice + taxAmount;

        System.out.println("Очікуваний результат: 0.3");
        System.out.println("Фактичний результат double: " + totalAmount);
        // Виведе: 0.30000000000000004 (Звідки взялася 4 в кінці?)
    }

    public static void main(String[] args) {
        demonstrateOverflow();
        safeAddition();
        demonstrateFloatingPointInaccuracy();
    }
}
