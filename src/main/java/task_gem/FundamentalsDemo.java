package task_gem;

public class FundamentalsDemo {

    public static void demonstrateMemoryAndWrappers() {
        System.out.println("--- Демонстрація типів та оберток ---");

        // Примітив зберігається безпосередньо у Stack
        int primitiveAge = 25;

        // Обертка: посилання лежить у Stack, а сам об'єкт Integer зі значенням 25 створюється в Heap
        Integer wrapperAge = Integer.valueOf(primitiveAge);

        // Корисний метод обертки: перетворення рядка з тексту в число
        String inputData = "500";
        int parsedAmount = Integer.parseInt(inputData);
        System.out.println("Успішно розпарсено суму: " + parsedAmount + " грн.");
    }

    public static void demonstrateIncrementDecrement() {
        System.out.println("\n--- Демонстрація інкременту та декременту ---");

        int firstCounter = 10;
        int secondCounter = 10;

        // Постфіксна форма: спочатку значення передається в println, а потім збільшується
        System.out.println("Постфіксний (++ після): " + (firstCounter++)); // Виведе 10, але в пам'яті стане 11
        System.out.println("Значення першого лічильника після кроку: " + firstCounter); // Виведе 11

        // Префіксна форма: спочатку значення збільшується в пам'яті, а потім передається в println
        System.out.println("Префіксний (++ перед): " + (++secondCounter)); // Виведе 11, в пам'яті вже 11
    }

    public static void demonstrateStringConcatenation() {
        System.out.println("\n--- Демонстрація роботи чисел зі строками ---");

        // Рух зліва направо: спочатку додаються числа 5 + 5 = 10, потім додається рядок
        System.out.println(5 + 5 + " сума чисел спочатку"); // Виведе: "10 сума чисел спочатку"

        // Рух зліва направо: рядок склеюється з першою 5, виходить рядок, який склеюється з другою 5
        System.out.println("рядок спочатку " + 5 + 5); // Виведе: "рядок спочатку 55"
    }

    public static void demonstrateBooleanAlgebra() {
        System.out.println("\n--- Демонстрація умовних операторів та булевої алгебри ---");

        boolean hasPremiumSubscription = true;
        int userBalanceInCents = 1000; // 10 гривень
        int itemPriceInCents = 800;    // 8 гривень

        // Логічне І (&&) та порівняння
        if (hasPremiumSubscription && userBalanceInCents >= itemPriceInCents) {
            System.out.println("Доступ дозволено: Користувач має Premium та достатньо коштів.");
        } else {
            System.out.println("Доступ відхилено.");
        }

        // Демонстрація інверсії (!)
        boolean isAccountBlocked = false;
        if (!isAccountBlocked) {
            System.out.println("Статус аккаунту: Активний (не заблокований).");
        }
    }

    public static void main(String[] args) {
        demonstrateMemoryAndWrappers();
        demonstrateIncrementDecrement();
        demonstrateStringConcatenation();
        demonstrateBooleanAlgebra();
    }
}