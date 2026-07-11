package com.goit.billing;

public class TariffBillingProcessor {

    public long calculateTariffCost(SubscriptionLevel level) {
        return switch (level) {
            case GUEST -> 0L;
            case BASE -> 500L;
            case PREMIUM -> 1500L;
            case ENTERPRISE -> 5000L;
        };
    }

    /**
     * Бізнес-логіка списання коштів.
     * Приймає поточний баланс користувача та рівень підписки, який він хоче придбати.
     */
    public void processBilling(long userBalance, SubscriptionLevel desiredLevel) {
        System.out.println("--- Початок транзакції ---");
        System.out.println("Поточний баланс користувача: " + userBalance + " центів.");
        System.out.println("Запит на активацію підписки: " + desiredLevel);

        // Отримуємо вартість обраного тарифу
        long cost = calculateTariffCost(desiredLevel);
        System.out.println("Вартість тарифу становить: " + cost + " центів.");

        // Керувальна конструкція if-else для перевірки балансу
        if (userBalance >= cost) {
            // Оператор присвоєння зі списанням (баланс зменшується на величину вартості)
            userBalance -= cost;
            System.out.println("Оплату успішно проведено! Підписку " + desiredLevel + " активовано.");
            System.out.println("Залишок на балансі: " + userBalance + " центів.");
        } else {
            System.out.println("Помилка: Недостатньо коштів на балансі! Потрібно ще: " + (cost - userBalance) + " центів.");
        }
        System.out.println("--- Кінець транзакції ---\n");
    }

    public static void main(String[] args) {
        TariffBillingProcessor processor = new TariffBillingProcessor();

        // Кейс 1: Успішна оплата тарифу PREMIUM
        // У користувача на рахунку $20.00 (2000 центів)
        long balanceAlex = 2000L;
        processor.processBilling(balanceAlex, SubscriptionLevel.PREMIUM);

        // Кейс 2: Помилка оплати тарифу ENTERPRISE
        // У користувача на рахунку лише $10.00 (1000 центів)
        long balanceBob = 1000L;
        processor.processBilling(balanceBob, SubscriptionLevel.ENTERPRISE);
    }
}
