package task_gem;

public class LoopTest {

    public static void loopTestNumberFor(int number) {
        for (int i = 1; i < number; i++) {
            if (i % 2 == 0) {
                System.out.println("Виводимо за допомогою циклу for: " + i);
            }
        }
    }

    public static void loopTestStringWhile(int number) {
        int i = 1;
        while (i < number) {
            if (i % 2 == 0) {
                System.out.println("Виводимо за допомогою циклу while: " + i);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        loopTestNumberFor(20);
        loopTestStringWhile(20);
    }
}
