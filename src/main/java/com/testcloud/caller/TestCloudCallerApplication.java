package com.testcloud.caller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TestCloudCallerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestCloudCallerApplication.class, args);
	}

	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}
}
