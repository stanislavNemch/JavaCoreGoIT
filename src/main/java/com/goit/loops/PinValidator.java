package com.goit.loops;

public class PinValidator {

    public static void inputValidator() {
        int correctPin = 1234;
        int[] enteredPins = {1111, 2222, 1234}; // імітація введення: 2 помилки, потім правильний PIN
        boolean isAuthenticated = false;

        for (int attempt = 1; attempt <= 3; attempt++) {
            int enteredPin = enteredPins[attempt - 1];
            System.out.println("Спроба №" + attempt + ". Введений PIN: " + enteredPin);

            if (enteredPin == correctPin) {
                System.out.println("Вхід успішний. Доступ дозволено.");
                isAuthenticated = true;
                break;
            } else {
                System.out.println("Помилка: невірний PIN-код.");
            }
        }

        if (!isAuthenticated) {
            System.out.println("Картку заблоковано після 3 невдалих спроб.");
        }
    }

    public static void main(String[] args) {
        inputValidator();
    }
}