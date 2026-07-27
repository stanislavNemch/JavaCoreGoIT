package task_gem;

public class MasterSummary {

    /**
     * Прикладний метод, що демонструє роботу з індексами та підрядками.
     */
    public String processText(String input) {
        // 1. Захист від порожніх значень (Defensive Programming)
        if (input == null || input.isBlank()) {
            return "EMPTY_INPUT";
        }

        // 2. Очищення та нормалізація (Sanitization)
        String clean = input.trim().toLowerCase();

        // 3. Робота з індексами та substring
        // Візьмемо середину слова, якщо воно довше 4 символів
        if (clean.length() > 4) {
            int mid = clean.length() / 2;
            String half = clean.substring(0, mid); // Виключаючи середній символ
            return "HALF_" + half.toUpperCase();
        }

        // 4. Заміна символів (Transformation)
        return clean.replace('a', '@').replace('e', '3');
    }

    public static void main(String[] args) {
        MasterSummary master = new MasterSummary();

        // Тест 1: Очищення та підрізання
        System.out.println("Test 1 (Normal): " + master.processText("  HelloWorld  "));
        // Результат: HALF_HELL (довжина 10, mid=5, substring(0,5) -> hello)

        // Test 2: Заміна символів
        System.out.println("Test 2 (Replace): " + master.processText("apple"));
        // Результат: @ppl3

        // Test 3: Порожній ввід
        System.out.println("Test 3 (Blank): " + master.processText("   \n \t "));
        // Результат: EMPTY_INPUT
    }
}
