package task_gem;

public class AccessRightsCheck {
    public enum UserRole { ADMIN, MANAGER, CUSTOMER }

    public String checkAccess(UserRole role) {
        return switch (role) {
            case ADMIN -> "FULL_ACCESS";
            case MANAGER -> "LIMITED_ACCESS";
            case CUSTOMER -> "READ_ONLY";
        };
    }

    public String checkAccess(String role) {
        try {
            return checkAccess(UserRole.valueOf(role));
        } catch (IllegalArgumentException e) {
            return "DENIED";
        }
    }

    public static void main(String[] args) {
        AccessRightsCheck checker = new AccessRightsCheck();

        System.out.println("ADMIN -> " + checker.checkAccess(UserRole.ADMIN));
        System.out.println("MANAGER -> " + checker.checkAccess(UserRole.MANAGER));
        System.out.println("CUSTOMER -> " + checker.checkAccess(UserRole.CUSTOMER));
        System.out.println("GUEST -> " + checker.checkAccess("GUEST"));
    }
}
