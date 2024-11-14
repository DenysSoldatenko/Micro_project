package com.example.servicefraud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * Main entry point for the Service Fraud application.
 * Enables service discovery and loads environment-specific properties.
 */
@EnableDiscoveryClient
@SpringBootApplication
@PropertySources({
  @PropertySource("classpath:application-${spring.profiles.active}.properties")
})
public class ServiceFraudApplication {

  /**
   * Main method to start the Service Fraud application.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    SpringApplication.run(ServiceFraudApplication.class, args);
  }
}
