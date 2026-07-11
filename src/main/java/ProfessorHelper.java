public class ProfessorHelper {
    public boolean areNumbersCool(int number1, int number2) {
        return number1 == number2;
    }
    public boolean areNumbersFatal(int number1, int number2) {
        int testNumber = (number1 * 5) + 3;
        return testNumber == number2;
    }

    public boolean canPrincessMarry(int day) {
        return day > 15;
    }

    public static void main(String[] args) {
        ProfessorHelper helper = new ProfessorHelper();
        System.out.println("areNumbersCool(3, 3) = " + helper.areNumbersCool(3, 3)); //Should be true
        System.out.println("areNumbersCool(5, 7) = " + helper.areNumbersCool(5, 7)); //Should be false

        System.out.println("areNumbersFatal(1, 8) = " + helper.areNumbersFatal(1, 8)); //Should be true
        System.out.println("areNumbersFatal(1, 9) = " + helper.areNumbersFatal(1, 9)); //Should be false

        System.out.println("canPrincessMarry(20) = " + helper.canPrincessMarry(20)); //Should be true
        System.out.println("canPrincessMarry(16) = " + helper.canPrincessMarry(16)); //Should be true
        System.out.println("canPrincessMarry(4) = " + helper.canPrincessMarry(4)); //Should be false
    }
}
