package com.example.servicenotification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * Main application class for the Notification service.
 * Configures Spring Boot, enables service discovery,
 * and loads properties based on the active profile.
 */
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

  /**
   * Main method to run the Spring Boot application.
   *
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    SpringApplication.run(ServiceNotificationApplication.class, args);
  }
}
