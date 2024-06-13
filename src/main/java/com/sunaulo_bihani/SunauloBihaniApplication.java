package com.sunaulo_bihani;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.sunaulo_bihani.repository")
public class SunauloBihaniApplication {

	public static void main(String[] args) {
		SpringApplication.run(SunauloBihaniApplication.class, args);
	}
}
