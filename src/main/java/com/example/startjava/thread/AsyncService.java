package com.example.startjava.thread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    // 해당 executor를 사용해서 비동기 실행
    @Async("customExecutor")
    public void runAsyncTask() {
        System.out.println(Thread.currentThread().getName() + " 비동기 작업 시작");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(Thread.currentThread().getName() + " 비동기 작업 완료");
    }
}