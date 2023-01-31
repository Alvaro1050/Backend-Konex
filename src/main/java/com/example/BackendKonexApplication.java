package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {
        "com.example.repositories",
        "com.example.services",
        "com.example.controllers",
        "com.example.configurations",
        "com.example.models"
})
public class BackendKonexApplication {
    public static void main(String[] args) {
        SpringApplication.run(BackendKonexApplication.class, args);
    }

}
