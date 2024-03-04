package com.example.First_Mock;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@SpringBootApplication
public class FirstMockApplication {
    public static void main(String[] args) {
        SpringApplication.run(FirstMockApplication.class, args);
    }
}
