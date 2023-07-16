package com.example.springtask2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Slf4j
@Order(1)
public class Logger implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info(Arrays.toString(args));
    }
}
