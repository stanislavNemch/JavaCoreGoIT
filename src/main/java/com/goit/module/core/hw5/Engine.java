package com.goit.module.core.hw5;

class Engine {

    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getFuelType() {
        return "A500";
    }

    public static void main(String[] args) {
        System.out.println(new Engine().getFuelType());
        System.out.println(new XFuelEngine().getFuelType());
        AdvancedXFuelEngine engine = new AdvancedXFuelEngine();
        engine.setPower(1000);
        engine.setSerialNumber("SN504030");
        engine.printInfo(); //Serial number is SN504030, power is 1000
    }
}

class XFuelEngine extends Engine {

    protected String serialNumber;

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String getFuelType() {
        return "XFuel";
    }
}

class AdvancedXFuelEngine extends XFuelEngine {

    public void printInfo(){
        System.out.println("Serial number is " + serialNumber + ", power is " + getPower());
    }
}

