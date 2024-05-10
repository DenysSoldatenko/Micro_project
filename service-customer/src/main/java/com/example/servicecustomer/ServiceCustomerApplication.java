package com.example.servicecustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@EnableDiscoveryClient
@SpringBootApplication(
	scanBasePackages = {
    "com.example.servicecustomer",
		"org.example.serviceamqp",
	}
)
@PropertySources({
	@PropertySource("classpath:application-${spring.profiles.active}.properties")
})
@EnableFeignClients(basePackages = "org.example.feignservice")
public class ServiceCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceCustomerApplication.class, args);
	}

}
