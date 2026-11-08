package practice.module.five;

public class Cargo {

    // Поле екземпляра (Instance Variable): кожен об'єкт у Heap зберігає власне значення
    private int weight;

    // Статична константа класу: посилання зберігається в Metaspace і спільне для всіх
    public static final int[] LIMITS = {10, 20};

    // Конструктор для ініціалізації стану
    public Cargo(int weight) {
        this.weight = weight;
    }

    // Метод екземпляра: звертається до поля конкретного об'єкта через приховане посилання this
    public int read() {
        return this.weight;
    }

    // Метод зміни ваги конкретного вантажу
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {
        // Cargo.LIMITS = new int[]{30, 40}; // Помилка компіляції: cannot assign a value to final variable
        // 'LIMITS'. Модифікатор final забороняє переприсвоювати посилання (змінювати адресу об'єкта в пам'яті)
        // після ініціалізації.

        Cargo firstCargo = new Cargo(10);
        Cargo secondCargo = new Cargo(20);

        System.out.println(firstCargo.read());
        System.out.println(secondCargo.read());

        firstCargo.setWeight(15);

        System.out.println(firstCargo.read());
        System.out.println(secondCargo.read());
    }
}
