package com.recycle.Recycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "Recycle")
@EnableJpaRepositories("Recycle.repositories")
public class RecycleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecycleApplication.class, args);
	}

}
