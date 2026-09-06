package com.goit.module.core.hw4;

import java.util.regex.Pattern;

public class CheapStocks {
        private static final Pattern PATTERN = Pattern.compile("\\d+");

    public String getCheapStocks(String[] stocks) {
        if (stocks == null || stocks.length == 0) {
            return "";
        }

        String result = "";

        for (String stock : stocks) {
            String[] parts = stock.split(" ");

            if (parts.length < 2) {
                continue; // Пропускаємо елементи, які не мають ціни
            }

            if (parts[1] == null || parts[1].isEmpty() || !PATTERN.matcher(parts[1]).matches()) {
                continue; // Пропускаємо елементи, де ціна відсутня або некоректна
            }

            int price = Integer.parseInt(parts[1]);

            if (price < 200) {
                result += parts[0] + " ";
            }
        }
        return result.trim();
    }

    /**
     * Продакшен-варіант з використанням StringBuilder.
     */
    public String getCheapStocksProduction(String[] stocks) {
        if (stocks == null || stocks.length == 0) {
            return "";
        }

        StringBuilder cheapStocksBuilder = new StringBuilder();

        for (String stock : stocks) {
            String[] parts = stock.split(" ");

            if (parts.length < 2) {
                continue; // Пропускаємо елементи, які не мають ціни
            }

            if (parts[1] == null || parts[1].isEmpty() || !PATTERN.matcher(parts[1]).matches()) {
                continue; // Пропускаємо елементи, де ціна відсутня або некоректна
            }

            int price = Integer.parseInt(parts[1]);

            if (price < 200) {
                if (!cheapStocksBuilder.isEmpty()) {
                    cheapStocksBuilder.append(" ");
                }
                cheapStocksBuilder.append(parts[0]);
            }
        }

        return cheapStocksBuilder.toString();
    }

    public static void main(String[] args) {
        CheapStocks cheapStocks = new CheapStocks();
        System.out.println("Власник інтернет-магазину вирішив залишити ті товари, які коштують менше ніж 200 монет.");
        System.out.println("Товари {\"gun 500\", \"firebow 70\", \"pixboom 200\", \"part 60\"}: " + cheapStocks.getCheapStocks(new String[]
                {"gun 500", "firebow 70", "pixboom 200", "part 60"}));
        System.out.println("Товари {}: " + cheapStocks.getCheapStocks(new String[] {}));
        System.out.println("Товари null: " + cheapStocks.getCheapStocks(null));

        System.out.println("\nПродакшен-варіант з використанням StringBuilder:");
        System.out.println("Товари {\"gun 500\", \"firebow 70\", \"pixboom 200\", \"part 60\"} (Production): " + cheapStocks.getCheapStocksProduction(new String[]
                {"gun 500", "firebow 70", "pixboom 200", "part 60"}));
    }
}
