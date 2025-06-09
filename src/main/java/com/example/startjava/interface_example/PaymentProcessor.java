package com.example.startjava.interface_example;

public interface PaymentProcessor {
    void process();

    default String getPaymentMethodName() {
        System.out.println("Unknown Payment Method");
        return "Unknown Payment Method";
    }
}
