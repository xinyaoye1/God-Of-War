package com.javasm.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class FirstStringApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstStringApplication.class, args);
    }

}
