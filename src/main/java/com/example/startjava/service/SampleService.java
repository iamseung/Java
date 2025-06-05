package com.example.startjava.service;

import com.example.startjava.annotations.LogExecutionTime;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    @LogExecutionTime
    public void serve() throws InterruptedException {
        Thread.sleep(500);
    }
}
