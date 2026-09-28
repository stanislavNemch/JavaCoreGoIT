package com.goit.module.core.hw5;

public class SpaceShip {

    private static final int MAX_NAME_LENGTH = 100;
    private static final String SERIAL_PATTERN = "SN\\d{6}";
    private String name;
    private String serialNumber;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {

        // 1. Guard Clause: відсікаємо всі неприпустимі сценарії
        if (serialNumber == null) {
            return;
        }
        // 2. Guard Clause: перевіряємо, чи серійний номер не порожній
        if (serialNumber.isBlank()) {
            return;
        }
        // 3. Guard Clause: перевіряємо, чи серійний номер вже встановлений
        if (this.serialNumber != null) {
            return;
        }
        // 4. Guard Clause: перевіряємо формат серійного номера
        if (!serialNumber.matches(SERIAL_PATTERN)) {
            return;
        }

        // 5. Happy Path: встановлюємо серійний номер
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // 1. Guard Clause: відсікаємо всі неприпустимі сценарії
        if (name == null) {
            return;
        }
        // 2. Guard Clause: перевіряємо, чи ім'я не порожнє
        if (name.isBlank()) {
            return;
        }
        // 3. Guard Clause: перевіряємо довжину імені
        if (name.length() > MAX_NAME_LENGTH) {
            return;
        }
        this.name = name;
    }
}
