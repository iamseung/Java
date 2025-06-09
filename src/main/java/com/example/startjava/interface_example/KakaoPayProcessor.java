package com.example.startjava.interface_example;

public class KakaoPayProcessor implements PaymentProcessor {

    @Override
    public void process() {
        System.out.println("Processing with KakaoPay");
    }

    @Override
    public String getPaymentMethodName() {
        return "KakaoPayProcessor";
    }
}
