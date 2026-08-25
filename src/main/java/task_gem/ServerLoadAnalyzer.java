package task_gem;

import java.util.Arrays;

public class ServerLoadAnalyzer {

    /**
     * Знаходить мінімальне та максимальне навантаження процесора за один прохід.
     */
    public int[] calculateLoadBoundaries(int[] loadMetrics) {
        // Захисна перевірка на null або порожній масив
        if (loadMetrics == null || loadMetrics.length == 0) {
            return new int[0];
        }

        // Ініціалізація початковими даними з нульового індексу
        int minLoad = loadMetrics[0];
        int maxLoad = loadMetrics[0];

        // Один прохід через класичний цикл for
        for (int i = 1; i < loadMetrics.length; i++) {
            int currentLoad = loadMetrics[i];

            if (currentLoad < minLoad) {
                minLoad = currentLoad;
            }
            if (currentLoad > maxLoad) {
                maxLoad = currentLoad;
            }
        }

        // Формування результату залежно від рівності значень
        if (minLoad == maxLoad) {
            return new int[]{minLoad};
        }

        return new int[]{minLoad, maxLoad};
    }

    public static void main(String[] args) {
        ServerLoadAnalyzer analyzer = new ServerLoadAnalyzer();

        int[] regularMetrics = {45, 12, 89, 3, 67};
        int[] uniformMetrics = {50, 50, 50};
        int[] emptyMetrics = {};

        int[] regularResult = analyzer.calculateLoadBoundaries(regularMetrics);
        int[] uniformResult = analyzer.calculateLoadBoundaries(uniformMetrics);
        int[] emptyResult = analyzer.calculateLoadBoundaries(emptyMetrics);

        // Виведення результатів роботи аналізатора
        System.out.println("--- Результати аналізу метрик ---");
        System.out.println("Звичайний масив: " + Arrays.toString(regularResult));
        System.out.println("Однаковий масив: " + Arrays.toString(uniformResult));
        System.out.println("Порожній масив: " + Arrays.toString(emptyResult));
    }
}
