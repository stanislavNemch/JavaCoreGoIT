package practice;

class Order {
    private static final long MIN_AMOUNT = 1;

    private final String orderId;
    private final String customerName;
    private long amount;
    private boolean isPaid;

    // 1. Головний конструктор (Canonical Constructor)
    public Order(String orderId, String customerName, long amount) {
        // Захист інваріантів: замовлення не може бути створене без ID або клієнта
        if (orderId == null || orderId.isBlank()) {
            this.orderId = "UNKNOWN";
        } else {
            this.orderId = orderId;
        }

        if (customerName == null || customerName.isBlank()) {
            this.customerName = "Anonymous";
        } else {
            this.customerName = customerName;
        }

        // ⏩ СПОЙЛЕР (M6): у реальному проді тут викидають виключення (throw new IllegalArgumentException).
        // ✅ Варіант на вивченому (M5): встановлюємо мінімально допустиме безпечне значення.
        if (amount >= MIN_AMOUNT) {
            this.amount = amount;
        } else {
            this.amount = MIN_AMOUNT;
        }

        this.isPaid = false; // Нове замовлення завжди спочатку неоплачене
    }

    // 2. Перевантажений конструктор (Overloaded): якщо клієнт не вказаний — вважаємо його Guest
    public Order(String orderId, long amount) {
        // Виклик сусіднього конструктора через this(...) — усуваємо дублювання коду (DRY)
        this(orderId, "Guest", amount);
    }

    public void printOrderInfo() {
        System.out.println("Замовлення #" + orderId + " | Клієнт: " + customerName +
                " | Сума: " + amount + " грн | Оплачено: " + isPaid);
    }

    public static void main(String[] args) {
        Order order = new Order("ORD-777", -500);
        order.printOrderInfo();
    }
}