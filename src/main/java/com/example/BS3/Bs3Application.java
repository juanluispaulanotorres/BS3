package com.example.BS3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@SpringBootApplication
public class Bs3Application{

	public static void main(String[] args) {
		SpringApplication.run(Bs3Application.class, args);
	}

	@Bean
	@PostConstruct
	public void primera() {
		System.out.println("Hola desde la clase inicial");
	}

	@Bean
	public CommandLineRunner segunda() {
		return args -> {
			System.out.println("Hola desde la clase secundaria");
		};
	}

	@Bean
	public CommandLineRunner tercera() {
		return args -> {
			System.out.println("Soy la tercera clase");
		};
	}
}
