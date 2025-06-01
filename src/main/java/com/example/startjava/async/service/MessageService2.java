package com.example.startjava.async.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MessageService2 {

    private final ExecutorService executorService = Executors.newFixedThreadPool(10);

    public void print(String message) {
        executorService.submit(() -> System.out.println(message));
    }
}
