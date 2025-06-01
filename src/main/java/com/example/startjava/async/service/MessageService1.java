package com.example.startjava.async.service;

public class MessageService1 {
    public void print(String message) {
        new Thread(() -> System.out.println(message))
                .start();
    }
}
