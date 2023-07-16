package com.example.springtask2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Order(3)
public class Logger2 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.print(" Hello");
    }
}
