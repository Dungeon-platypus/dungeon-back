package com.fr.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class DungeonPlatypusBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(DungeonPlatypusBackApplication.class, args);
	}

}
