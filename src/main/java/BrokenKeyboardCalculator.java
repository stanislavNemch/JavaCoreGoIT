public class BrokenKeyboardCalculator {

    public int add(int a, int b) {
        a += b;
        return a;
    }

    public int sub(int a, int b) {
        a -= b;
        return a;
    }

    public int multiply(int a, int b) {
        a *= b;
        return a;
    }

    public int divide(int a, int b) {
        a /= b;
        return a;
    }

    public static void main(String[] args) {
        BrokenKeyboardCalculator calc = new BrokenKeyboardCalculator();
        System.out.println(calc.add(5, 3));
        System.out.println(calc.sub(8, 7));
        System.out.println(calc.multiply(1, 100));
        System.out.println(calc.divide(8, 4));
    }
}
