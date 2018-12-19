package com.Dosser.Test.Calculate.Calculate;

import com.Dosser.Test.Calculate.Calculate.controller.Logic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculateApplication implements CommandLineRunner {

	@Autowired
	private Logic logic;

	public static void main(String[] args) {
		SpringApplication.run(CalculateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logic.run();
	}
}

