package com.monthon.poc.sns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleSnsEndpointApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SimpleSnsEndpointApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SimpleSnsEndpointApplication.class, args);
	}

}
