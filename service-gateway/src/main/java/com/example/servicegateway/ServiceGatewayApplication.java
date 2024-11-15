package com.example.servicegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Main entry point for the Service Gateway application.
 * Enables service discovery for the gateway.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceGatewayApplication {

  /**
   * Main method to start the Service Gateway application.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    SpringApplication.run(ServiceGatewayApplication.class, args);
  }
}
