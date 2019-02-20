package com.qa.player;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlayerApplication {
	
	private PlayerApplication() {
		//Empty constructor
	}

	public static void main(String[] args) {
		SpringApplication.run(PlayerApplication.class, args);
	}

}
