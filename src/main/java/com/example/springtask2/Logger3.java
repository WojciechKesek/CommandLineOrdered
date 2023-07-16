package com.example.springtask2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Logger3 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.print("World");
    }
}
