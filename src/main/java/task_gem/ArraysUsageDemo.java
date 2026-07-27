package task_gem;

import java.util.Arrays;

public class ArraysUsageDemo {

    public static void main(String[] args) {
        // Початковий масив балів користувачів
        int[] userScores = {85, 42, 99, 73, 55};

        System.out.println("--- 1. Зручний вивід масиву ---");
        // Arrays.toString() перетворює масив на зрозумілий рядок
        System.out.println("Початкові бали: " + Arrays.toString(userScores));

        System.out.println("\n--- 2. Сортування масиву ---");
        // Arrays.sort() сортує масив на місці (змінює оригінальний масив у Heap)
        Arrays.sort(userScores);
        System.out.println("Відсортовані бали: " + Arrays.toString(userScores));

        System.out.println("\n--- 3. Швидкий бінарний пошук ---");
        // Пошук елемента 73 у відсортованому масиві
        int targetScore = 73;
        int foundIndex = Arrays.binarySearch(userScores, targetScore);
        System.out.println("Індекс елемента " + targetScore + " у масиві: " + foundIndex);

        System.out.println("\n--- 4. Копіювання та зміна розміру ---");
        // Створюємо новий масив із 3 найнижчих балів
        int[] lowestThreeScores = Arrays.copyOf(userScores, 3);
        System.out.println("Топ-3 найнижчих балів: " + Arrays.toString(lowestThreeScores));

        System.out.println("\n--- 5. Порівняння двох масивів ---");
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {1, 2, 3};

        // Оператор == порівнює посилання в Stack, а Arrays.equals() — елементи в Heap
        boolean isContentEqual = Arrays.equals(firstArray, secondArray);
        System.out.println("Чи однакові дані у масивах: " + isContentEqual);
    }
}
