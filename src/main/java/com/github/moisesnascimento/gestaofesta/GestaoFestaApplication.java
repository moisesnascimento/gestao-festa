package com.github.moisesnascimento.gestaofesta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.github.moisesnascimento.gestaofesta.*")
public class GestaoFestaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoFestaApplication.class, args);
	}

}
