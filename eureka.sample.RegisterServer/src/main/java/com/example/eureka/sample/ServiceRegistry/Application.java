package com.example.eureka.sample.ServiceRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer    // This is the dependency added for the eureka server for
					   // all the other services registration.

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
