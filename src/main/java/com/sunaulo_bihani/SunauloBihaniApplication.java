package com.sunaulo_bihani;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories
public class SunauloBihaniApplication {

	public static void main(String[] args) {
		SpringApplication.run(SunauloBihaniApplication.class, args);
	}
}
