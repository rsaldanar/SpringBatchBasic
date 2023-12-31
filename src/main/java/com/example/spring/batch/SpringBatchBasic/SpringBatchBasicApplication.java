package com.example.spring.batch.SpringBatchBasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBatchBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchBasicApplication.class, args);
	}

}
