package com.example.startjava.thread;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AsyncMain {

    public static void main(String[] args) {
        AsyncService asyncService = new AsyncService();
        asyncService.runAsyncTask();
    }
}
