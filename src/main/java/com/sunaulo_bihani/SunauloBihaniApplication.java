package com.sunaulo_bihani;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.sunaulo_bihani.repository")
@ComponentScan(basePackages = { "com.*" })
@EntityScan("com.sunaulo_bihani.model")
@ComponentScan(basePackages = "com.sunaulo_bihani")
public class SunauloBihaniApplication {

	public static void main(String[] args) {
		SpringApplication.run(SunauloBihaniApplication.class, args);
	}
}
