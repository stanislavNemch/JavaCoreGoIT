package com.goit.module.core.hw5;

public class SpaceShip {
    private String name;
    private String serialNumber;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        if (serialNumber == null || serialNumber.isBlank() || !serialNumber.equals("SN506788")) {
            return;
        }
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // 1. Guard Clause: відсікаємо всі неприпустимі сценарії
        if (name == null || name.isBlank() || name.length() > 100) {
            return;
        }

        // 2. Happy Path: гарантовано валідні дані
        this.name = name;
    }

    //Test output
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();
        System.out.println(ship.getName()); //Should be null
        ship.setName("Walker");
        System.out.println(ship.getName()); //Should be Walker
        ship.setName("");
        System.out.println(ship.getName()); //Should be Walker, empty value ignored
        ship.setName("Voyager".repeat(100));
        System.out.println(ship.getName()); //Should be Walker, too long value ignored

        ship.setSerialNumber("SN506788");
        System.out.println(ship.getSerialNumber()); //Should be SN506788

        ship.setSerialNumber("EE123456");
        System.out.println(ship.getSerialNumber()); //Should be SN506788 - old value
    }
}
