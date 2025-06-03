package com.example.startjava.async.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class MessageService3 {

    @Async
    public CompletableFuture<String> print(String message) throws InterruptedException {
        System.out.println("Task Start - " + message);
        Thread.sleep(3000);
        return new AsyncResult<>("jayon-" + message).completable();
    }
}
