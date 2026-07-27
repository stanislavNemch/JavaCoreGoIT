package com.goit.module.hw3;

import java.util.*;

public class MoonComputerTests {
    public void testBasicInputOutput() {
        // Створюємо об'єкт Scanner для читання даних з консолі
        Scanner scanner = new Scanner(System.in);

        // Зчитуємо цілий рядок тексту до переходу на новий рядок
        String inputLine = scanner.nextLine();

        // Виводимо отриманий текст у консоль
        System.out.println(inputLine);

        // Закриваємо сканер, щоб звільнити ресурси пам'яті
        scanner.close();
    }

    public void testMath() {
        Scanner scanner = new Scanner(System.in);

        int inputF = scanner.nextInt();
        int inputS = scanner.nextInt();


        int sum = inputF + inputS;
        int difference = inputF - inputS;
        int multiplication = inputF * inputS;
        int quotient = inputF / inputS;

        System.out.println(sum + " " + difference + " " + multiplication + " " + quotient);

        scanner.close();
    }

    // Тестовий вивід на Hello Java стандартний ввід
    public static void main(String[] args) {
        MoonComputerTests computerTests = new MoonComputerTests();
        //computerTests.testBasicInputOutput();
        computerTests.testMath();
    }
}
