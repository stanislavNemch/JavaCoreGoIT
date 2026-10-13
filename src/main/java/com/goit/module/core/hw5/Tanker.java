package com.goit.module.core.hw5;

class Tanker {

    private String serialNumber;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    protected String getFuelType() {
        return "A500";
    }

    public void refuel(int amount) {
        System.out.println("Add " + amount + " of " + getFuelType() + ", tanker serial number is " + getSerialNumber());
    }

    public static void main(String[] args) {
        Tanker tanker = new Tanker();
        tanker.setSerialNumber("SN504030");
        tanker.refuel(300);

        Tanker tankerXFuel = new XFuelTanker();
        tankerXFuel.setSerialNumber("SN504030");
        tankerXFuel.refuel(300);

        Tanker tankerMX200 = new MX200Tanker();
        tankerMX200.setSerialNumber("SN504030");
        tankerMX200.refuel(300);
    }
}

class XFuelTanker extends Tanker {

    @Override
    protected String getFuelType() {
        return "XFuel";
    }
}

class MX200Tanker extends Tanker {

    @Override
    protected String getFuelType() {
        return "MX200";
    }
}
