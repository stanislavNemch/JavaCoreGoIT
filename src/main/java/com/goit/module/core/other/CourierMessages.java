package com.goit.module.core.other;

public class CourierMessages {

    public static String generateDeliveryStatus(String orderId, String courierName) {
        return "Order #" + orderId + " is assigned to courier " + courierName;
    }

    public static void main(String[] args) {
        System.out.println(CourierMessages.generateDeliveryStatus("12345", "John Doe"));

        String orderId = "12345";
        String courierName = "John Doe";
        String deliveryStatus = CourierMessages.generateDeliveryStatus(orderId, courierName);
        System.out.println(deliveryStatus);
    }
}
