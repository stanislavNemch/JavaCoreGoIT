package practice.module.five;

public class Warehouse {
    public static void modify(Cargo cargoRef, int[] limitsRef) {
        cargoRef.setWeight(80);
        cargoRef = new Cargo(999);
        cargoRef.setWeight(777);

        limitsRef[0] = 55;
        limitsRef = new int[]{1, 2};
        limitsRef[0] = 33;
    }

    public static void main(String[] args) {
        Cargo myCargo = new Cargo(10);
        int[] myLimits = {10, 20};

        modify(myCargo, myLimits);

        System.out.println(myCargo.read());
        System.out.println(myLimits[0]);
    }
}
