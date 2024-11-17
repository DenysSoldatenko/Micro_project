package com.example.servicenotification.services;

import org.example.feignservice.notification.NotificationRequest;

/**
 * Service interface for sending notifications to customers.
 */
public interface NotificationService {
  /**
   * Sends a notification based on the provided request.
   *
   * @param request the notification details to be sent
   */
  void send(NotificationRequest request);
}
