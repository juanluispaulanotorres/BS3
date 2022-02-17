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

	@PostConstruct
	public void primera() {
		System.out.println("Hola desde la clase inicial");
	}

	@Bean
	public CommandLineRunner segunda() throws Exception {
		return args -> {
			System.out.println("Hola desde la clase secundaria");
		};
	}

	@Bean
	public void tercera() throws Exception {
		ClaseTercera ct = new ClaseTercera();

		ct.run("Hola nueva clase");
	}
}