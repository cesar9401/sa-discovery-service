package com.cesar31.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SaDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaDiscoveryServiceApplication.class, args);
	}
}
