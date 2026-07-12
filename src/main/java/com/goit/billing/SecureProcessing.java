package com.goit.billing;

/**
 * Клас для демонстрації базової бізнес-логіки та контролю безпеки типів.
 */
public class SecureProcessing {

    // Метод для перевірки та проведення транзакції (гвардіян-методи)
    public static boolean processDebiting(long currentAccountBalance, long debitAmount) {

        // Security Check: захист від від'ємних сум (експлоїт з нарахуванням грошей)
        if (debitAmount <= 0) {
            System.out.println("Помилка безпеки: Сума списання повинна бути більшою за нуль!");
            return false;
        }

        // Перевірка наявності достатньої кількості коштів
        if (currentAccountBalance >= debitAmount) {
            System.out.println("Транзакція дозволена. Буде знято: " + debitAmount + " копійок.");
            return true;
        } else {
            System.out.println("Відмова: Недостатньо коштів на рахунку користувача!");
            return false;
        }
    }

    public static void main(String[] args) {
        // Пам'ятаємо правило: зберігаємо гроші в цілих числах (копійках/центах)
        long clientBalance = 250000L; // 2500.00 гривень
        long tariffCost = 199900L; // 1999.00 гривень

        // Запуск логіки
        boolean operationStatus = processDebiting(clientBalance, tariffCost);
        System.out.println("Кінцевий статус транзакції: " + operationStatus);
    }
}