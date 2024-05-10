package com.example.servicenotification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@EnableDiscoveryClient
@SpringBootApplication(
	scanBasePackages = {
		"com.example.servicenotification",
		"org.example.serviceamqp",
	}
)
@PropertySources({
	@PropertySource("classpath:application-${spring.profiles.active}.properties")
})
public class ServiceNotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceNotificationApplication.class, args);
	}

}
