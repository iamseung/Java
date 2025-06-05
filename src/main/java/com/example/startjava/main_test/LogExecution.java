package com.example.startjava.main_test;

import com.example.startjava.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@RequiredArgsConstructor
public class LogExecution {

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.example.startjava");

        SampleService sampleService = context.getBean(SampleService.class);
        sampleService.serve();

        context.close();
    }
}
