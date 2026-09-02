package task_gem;

import java.util.Arrays;

public class CleanStockMerger {
    /**
     * Об'єднує масиви товарів за патерном "Біжучий індекс" (Running Index).
     */
    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
        // Захист від null через безпечну ініціалізацію
        String[] safeShowcase = (showcaseStocks == null) ? new String[0] : showcaseStocks;
        String[] safeWarehouse = (warehouseStocks == null) ? new String[0] : warehouseStocks;

        String[] result = new String[safeShowcase.length + safeWarehouse.length];
        int cursor = 0;

        // Послідовне заповнення за допомогою for-each та пост-інкременту
        for (String stock : safeShowcase) {
            result[cursor++] = stock;
        }

        for (String stock : safeWarehouse) {
            result[cursor++] = stock;
        }

        return result;
    }

    public static void main(String[] args) {
        CleanStockMerger merger = new CleanStockMerger();

        String[] showcase = {"gun", "bow"};
        String[] warehouse = {"firegun"};

        String[] mergedStocks = merger.mergeStocks(showcase, warehouse);

        System.out.println("--- Результат об'єднання списків ---");
        System.out.println("Фінальний перелік товарів: " + Arrays.toString(mergedStocks));
    }
}
