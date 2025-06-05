package com.example.startjava.main_test;

import com.example.startjava.service.SampleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartJavaApplication implements CommandLineRunner {

    private final SampleService sampleService;

    public StartJavaApplication(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    public static void main(String[] args) {
        SpringApplication.run(StartJavaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        sampleService.serve();
    }
}
