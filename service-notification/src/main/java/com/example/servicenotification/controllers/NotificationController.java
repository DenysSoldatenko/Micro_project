package com.example.servicenotification.controllers;

import com.example.servicenotification.services.NotificationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.feignservice.notification.NotificationRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for handling notifications.
 * It provides an endpoint to send notifications to customers.
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("api/v1/notification")
public class NotificationController {

  private final NotificationService notificationService;

  /**
   * Endpoint to send a notification to a customer.
   *
   * @param request the notification request containing customer details and the message
   */
  @PostMapping
  public void sendNotification(@RequestBody NotificationRequest request) {
    log.info("Sending new notification to customer: {}", request);
    notificationService.send(request);
  }
}
