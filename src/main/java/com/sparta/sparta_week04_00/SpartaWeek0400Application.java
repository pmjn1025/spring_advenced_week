package com.sparta.sparta_week04_00;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpartaWeek0400Application {

	public static void main(String[] args) {
		SpringApplication.run(SpartaWeek0400Application.class, args);


	}


}
