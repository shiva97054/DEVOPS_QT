package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
@EnableEurekaServer

public class EurekaServerApplication {
	//private static final Logger logger = LoggerFactory.getLogger(EurekaServerApplication.class);
        // chandra changed on 06-Aug-2024
	public static void main(String[] args) {
		//logger.info("Example log from {}", EurekaServerApplication.class.getSimpleName());
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
