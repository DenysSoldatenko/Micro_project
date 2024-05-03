package com.example.servicenotification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(
	scanBasePackages = {
		"com.example.servicenotification",
		"com.example.serviceamqp",
	}
)
public class ServiceNotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceNotificationApplication.class, args);
	}

}
