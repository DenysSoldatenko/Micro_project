package com.example.servereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Entry point for the Eureka Server application.
 * Enables the Eureka Server functionality to register and discover services.
 */
@EnableEurekaServer
@SpringBootApplication
public class ServerEurekaApplication {

  /**
   * Starts the Eureka Server application.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    SpringApplication.run(ServerEurekaApplication.class, args);
  }
}

