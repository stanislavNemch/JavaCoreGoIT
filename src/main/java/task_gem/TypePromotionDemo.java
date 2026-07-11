package task_gem;

public class TypePromotionDemo {
    public static void main(String[] args) {
        byte dailyLimit = 100;
        char transactionModifier = 'A'; // В ASCII таблице это число 65 [cite: 340, 341]

        // Какого типа будет результат этой операции?
        var currentStatus = dailyLimit + transactionModifier;
        System.out.println("Тип результата: " + ((Object) currentStatus).getClass().getSimpleName());
    }
}
