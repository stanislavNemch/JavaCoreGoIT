package com.goit.module.core.hw5;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

// Шпаргалка:
// @Test — позначає метод, який JUnit запускає як окремий тест.
// assertEquals(очікуване, фактичне) — перевіряє, що два значення рівні.
// assertNull(значення) — перевіряє, що значення дорівнює null.
// Правило тесту: 1) підготувати об'єкт, 2) викликати метод, 3) перевірити результат.
class SpaceShipTest {

    @Test
    void nameIsInitiallyNull() {
        SpaceShip ship = new SpaceShip();
        assertNull(ship.getName());
    }

    @Test
    void serialNumberIsInitiallyNull() {
        SpaceShip ship = new SpaceShip();
        assertNull(ship.getSerialNumber());
    }

    // Приклад звичайного тесту: створили корабель -> задали ім'я -> перевірили геттером.
    @Test
    void setNameStoresValidName() {
        SpaceShip ship = new SpaceShip();
        ship.setName("Walker");
        assertEquals("Walker", ship.getName());
    }

    @Test
    void setNameIgnoresBlankValueAndKeepsPrevious() {
        SpaceShip ship = new SpaceShip();
        ship.setName("Walker");
        ship.setName("");
        assertEquals("Walker", ship.getName());
    }

    @Test
    void setNameIgnoresNullValueAndKeepsPrevious() {
        SpaceShip ship = new SpaceShip();
        ship.setName("Walker");
        ship.setName(null);
        assertEquals("Walker", ship.getName());
    }

    @Test
    void setNameAcceptsExactlyMaxLength() {
        SpaceShip ship = new SpaceShip();
        String maxLengthName = nameOfLength(100);
        ship.setName(maxLengthName);
        assertEquals(maxLengthName, ship.getName());
    }

    @Test
    void setNameRejectsValueAboveMaxLength() {
        SpaceShip ship = new SpaceShip();
        ship.setName("Walker");
        ship.setName(nameOfLength(101));
        assertEquals("Walker", ship.getName());
    }

    @Test
    void setNameIgnoresTooLongValueAndKeepsPrevious() {
        SpaceShip ship = new SpaceShip();
        ship.setName("Walker");
        ship.setName(nameOfLength(700));
        assertEquals("Walker", ship.getName());
    }

    @Test
    void serialNumberStoresValidValue() {
        SpaceShip ship = new SpaceShip();
        ship.setSerialNumber("SN506788");
        assertEquals("SN506788", ship.getSerialNumber());
    }

    @Test
    void serialNumberIgnoresWrongPrefixEE() {
        SpaceShip ship = new SpaceShip();
        ship.setSerialNumber("EE123456");
        assertNull(ship.getSerialNumber());
    }

    @Test
    void serialNumberIgnoresWrongPrefixHJ() {
        SpaceShip ship = new SpaceShip();
        ship.setSerialNumber("HJ879649");
        assertNull(ship.getSerialNumber());
    }

    @Test
    void serialNumberIgnoresWrongLength() {
        SpaceShip ship = new SpaceShip();
        ship.setSerialNumber("SN1067625");
        assertNull(ship.getSerialNumber());
    }

    @Test
    void serialNumberIgnoresNullValue() {
        SpaceShip ship = new SpaceShip();
        ship.setSerialNumber(null);
        assertNull(ship.getSerialNumber());
    }

    @Test
    void serialNumberIgnoresBlankValue() {
        SpaceShip ship = new SpaceShip();
        ship.setSerialNumber("   ");
        assertNull(ship.getSerialNumber());
    }

    @Test
    void serialNumberIgnoresLowercasePrefix() {
        SpaceShip ship = new SpaceShip();
        ship.setSerialNumber("sn506788");
        assertNull(ship.getSerialNumber());
    }

    @Test
    void serialNumberIgnoresNonDigitCharacters() {
        SpaceShip ship = new SpaceShip();
        ship.setSerialNumber("SN12A456");
        assertNull(ship.getSerialNumber());
    }

    @Test
    void serialNumberIsNotOverwrittenOnceSet() {
        SpaceShip ship = new SpaceShip();
        ship.setSerialNumber("SN506788");
        ship.setSerialNumber("SN999999");
        assertEquals("SN506788", ship.getSerialNumber());
    }

    // Перевіряємо, що printInfo() друкує рівно той рядок, який вимагає завдання.
    @Test
    void printInfoPrintsNameAndSerialNumber() {
        SpaceShip ship = new SpaceShip();
        ship.setName("Voyager");
        ship.setSerialNumber("SN506788");

        assertEquals("Name is Voyager, serial number is SN506788", printInfoToText(ship));
    }

    @Test
    void printInfoPrintsNothingWhenInfoIsMissing() {
        SpaceShip ship = new SpaceShip();

        assertEquals("", printInfoToText(ship));
    }

    // Допоміжний метод: викликає ship.printInfo() і повертає те, що метод надрукував у консоль.
    // Завдяки цьому весь складний код перехоплення виводу лежить в одному місці.
    private String printInfoToText(SpaceShip ship) {
        // 1. Запам'ятовуємо справжній System.out, щоб потім повернути його на місце.
        PrintStream realOut = System.out;
        // 2. Створюємо "буфер" у пам'яті — тимчасово туди буде писатися весь вивід.
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        // 3. Підміняємо System.out на потік, який пише у цей буфер.
        System.setOut(new PrintStream(buffer));
        try {
            // 4. Викликаємо метод: тепер його System.out.println пише у буфер, а не на екран.
            ship.printInfo();
        } finally {
            // 5. ОБОВ'ЯЗКОВО повертаємо справжній System.out, інакше зламаються інші тести.
            System.setOut(realOut);
        }
        // 6. Перетворюємо вміст буфера у звичайний рядок.
        //    trim() прибирає перехід на новий рядок, який println додає в кінці.
        return buffer.toString().trim();
    }

    // Допоміжний метод: будує рядок потрібної довжини, щоб перевіряти межу у 100 символів.
    private String nameOfLength(int length) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append("V");
        }
        return result.toString();
    }
}