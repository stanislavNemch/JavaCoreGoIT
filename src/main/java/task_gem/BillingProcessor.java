package task_gem;

//From Switch Statement to Switch Expression

public class BillingProcessor {

    public enum SubscriptionLevel { GUEST, BASE, PREMIUM, ENTERPRISE }

    public double calculateFee(SubscriptionLevel level, double amount) {
        return switch (level) {
            case GUEST -> amount * 0.05;
            case BASE -> amount * 0.03;
            case PREMIUM -> amount * 0.01;
            case ENTERPRISE -> 0.0;
        };
    }
}
