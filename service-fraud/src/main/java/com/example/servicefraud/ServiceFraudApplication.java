package com.example.servicefraud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@EnableDiscoveryClient
@SpringBootApplication
@PropertySources({
  @PropertySource("classpath:application-${spring.profiles.active}.properties")
})
public class ServiceFraudApplication {

  public static void main(String[] args) {
    SpringApplication.run(ServiceFraudApplication.class, args);
  }

}
