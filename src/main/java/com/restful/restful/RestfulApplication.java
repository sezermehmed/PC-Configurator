package com.restful.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RestfulApplication {

	public static void main(String[] args) throws Throwable {
		SpringApplication.run(RestfulApplication.class, args);
	}

}
