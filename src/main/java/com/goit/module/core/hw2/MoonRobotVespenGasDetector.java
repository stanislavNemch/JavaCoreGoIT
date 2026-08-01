package com.goit.module.core.hw2;

public class MoonRobotVespenGasDetector {

    public boolean isAcidOk(int acidValue, int minAcid, int maxAcid) {
        // Використовуємо оператор && (AND), щоб перевірити обидві межі одночасно
        return acidValue >= minAcid && acidValue <= maxAcid;
    }

    public boolean isTemperatureOk(boolean cold) {
        // Оператор ! (NOT) інвертує значення. Якщо cold = false, то !cold стане true.
        return !cold;
    }

    public boolean isDensityOk(int density) {
        // Використовуємо дужки для групування умов та оператор || (OR)
        return (density >= 1000 && density <= 5000) || (density >= 10000 && density <= 15000);
    }

    public boolean isGroundOkForVespenGas(int acidValue, int minAcid, int maxAcid, int density, boolean cold) {
        // Ми викликаємо вже написані методи (делегування).
        // Якщо всі три повернули true, результат буде true.
        return isAcidOk(acidValue, minAcid, maxAcid) &&
                isDensityOk(density) &&
                isTemperatureOk(cold);
    }

    public static void main(String[] args) {
        MoonRobotVespenGasDetector detector = new MoonRobotVespenGasDetector();

        System.out.println("Test 1 (Acid): " + detector.isAcidOk(100, 50, 150)); // true
        System.out.println("Test 2 (Density low): " + detector.isDensityOk(1500)); // true
        System.out.println("Test 3 (Density high): " + detector.isDensityOk(30000)); // false
        System.out.println("Test 4 (Temp warm): " + detector.isTemperatureOk(false)); // true
        System.out.println("Test 5 (Final verdict): " + detector.isGroundOkForVespenGas(120, 75, 150, 7500, false)); // true
    }
}
