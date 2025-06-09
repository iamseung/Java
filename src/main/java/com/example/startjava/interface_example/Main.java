package com.example.startjava.interface_example;

public class Main {

    public static void main(String[] args) {
        PaymentProcessor kakaoPayProcessor = new KakaoPayProcessor();
        PaymentProcessor naverPayProcessor = new NaverPayProcessor();
        kakaoPayProcessor.process();
        kakaoPayProcessor.getPaymentMethodName();
        naverPayProcessor.process();
        naverPayProcessor.getPaymentMethodName();
    }
}
