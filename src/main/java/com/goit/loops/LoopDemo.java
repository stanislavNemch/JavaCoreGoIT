package com.goit.loops;

public class LoopDemo {

    // Метод розраховує накопичені відсотки по депозиту за допомогою циклу for
    public static void calculateCompoundInterest(long initialDepositInCents, double annualRate, int years) {
        System.out.println("--- Розрахунок прибутку по депозиту ---");
        long currentBalance = initialDepositInCents;

        // Цикл for ідеальний, коли кількість років (кроків) відома заздалегідь
        for (int year = 1; year <= years; year++) {
            long earnedInterest = (long) (currentBalance * annualRate);
            currentBalance += earnedInterest;
            System.out.println("Рік " + year + ": баланс становить " + currentBalance + " центів.");
        }
        System.out.println("Кінцевий баланс за " + years + " р.: " + currentBalance + " центів.");
        System.out.println("--- Розрахунок завершено ---\n");
    }

    // Метод імітує спроби підключення до банку за допомогою циклу while
    public static void retryBankConnection() {
        System.out.println("--- Спроба з'єднання з банківським сервером ---");
        int attempt = 1;
        int maxAttempts = 3;
        boolean isConnected = false;

        // Цикл while працює, поки ми не перевищили ліміт спроб і немає успішного з'єднання
        while (attempt <= maxAttempts && !isConnected) {
            System.out.println("Надсилання запиту. Спроба #" + attempt);

            // Імітуємо, що зв'язок з'явиться лише на 3-й спробі
            if (attempt == 3) {
                isConnected = true;
                System.out.println("Успішно: З'єднання з банком встановлено!");
            } else {
                System.out.println("Помилка: Сервер банку не відповідає. Очікування...");
            }

            attempt++; // Переходимо до наступної спроби
        }

        if (!isConnected) {
            System.out.println("Критична помилка: Платіж скасовано через відсутність зв'язку!");
        }
        System.out.println("--- Завершення обробки підключення ---\n");
    }

    // Метод показує роботу do-while для обов'язкового першого запиту статусу транзакції
    public static void checkTransactionStatus() {
        System.out.println("--- Оновлення статусу транзакції ---");
        int queryCount = 0;
        boolean isProcessingFinished = false;

        // do-while гарантує, що запит статусу відбудеться хоча б один раз
        do {
            queryCount++;
            System.out.println("Запит до бази даних #" + queryCount + ". Перевірка статусу...");

            // Імітуємо, що транзакція обробилася на 2-му запиті
            if (queryCount >= 2) {
                isProcessingFinished = true;
                System.out.println("Статус оновлено: Транзакція успішно проведена!");
            } else {
                System.out.println("Статус: Очікування обробки...");
            }
        } while (!isProcessingFinished);

        System.out.println("--- Статус успішно зафіксовано ---");
    }

    public static void main(String[] args) {
        calculateCompoundInterest(100000L, 0.05, 3); // $1000.00 під 5% річних на 3 роки
        retryBankConnection();
        checkTransactionStatus();
    }
}