package com.example.startjava.interface_example;

public class NaverPayProcessor implements PaymentProcessor {

    @Override
    public void process() {
        System.out.println("Processing with NaverPay");
    }
}