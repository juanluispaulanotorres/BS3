package com.example.BS3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ClaseTercera implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        for (String s:args) {
            System.out.println(s);
        }
    }
}
