package task_gem;

public class IncrementDemo {

    public static void runIncrementExperiment() {
        System.out.println("--- Початок експерименту з інкрементом ---");

        int x = 5;
        System.out.println("Початкове значення x: " + x);

        // Запускаємо наше вираження
        int result = x++ + ++x;

        System.out.println("Результат обчислення (result): " + result); // Виведе 12!
        System.out.println("Кінцеве значення x в пам'яті: " + x);      // Виведе 7!
        System.out.println("--- Кінець експерименту ---");
    }

    public static void main(String[] args) {
        runIncrementExperiment();
    }
}
