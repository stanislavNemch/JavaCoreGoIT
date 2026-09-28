package com.goit.module.core.hw5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SpaceShipTest {

    @Test
    void nameIsInitiallyNull() {
        SpaceShip ship = new SpaceShip();
        assertNull(ship.getName());
    }

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
    void setNameIgnoresTooLongValueAndKeepsPrevious() {
        SpaceShip ship = new SpaceShip();
        ship.setName("Walker");
        ship.setName("Voyager".repeat(100));
        assertEquals("Walker", ship.getName());
    }

    @Test
    void serialNumberStoresValidValue() {
        SpaceShip ship = new SpaceShip();
        ship.setSerialNumber("SN506788");
        assertEquals("SN506788", ship.getSerialNumber());
    }

    @Test
    void serialNumberIgnoresWrongPrefixEEAndKeepsPrevious() {
        SpaceShip ship = new SpaceShip();
        ship.setSerialNumber("SN506788");
        ship.setSerialNumber("EE123456");
        assertEquals("SN506788", ship.getSerialNumber());
    }

    @Test
    void serialNumberIgnoresWrongPrefixHJAndKeepsPrevious() {
        SpaceShip ship = new SpaceShip();
        ship.setSerialNumber("SN506788");
        ship.setSerialNumber("HJ879649");
        assertEquals("SN506788", ship.getSerialNumber());
    }

    @Test
    void serialNumberIgnoresWrongLengthAndKeepsPrevious() {
        SpaceShip ship = new SpaceShip();
        ship.setSerialNumber("SN506788");
        ship.setSerialNumber("SN1067625");
        assertEquals("SN506788", ship.getSerialNumber());
    }
}