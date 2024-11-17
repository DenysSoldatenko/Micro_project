package com.example.servicenotification.utils;

import com.example.servicenotification.entities.Notification;
import java.time.LocalDateTime;
import lombok.experimental.UtilityClass;
import org.example.feignservice.notification.NotificationRequest;

/**
 * Utility class for handling notification-related operations.
 */
@UtilityClass
public class NotificationUtils {

  /**
   * Creates a Notification entity from a NotificationRequest.
   *
   * @param notificationRequest the request containing the notification details
   * @return a Notification entity populated with the details from the request
   */
  public static Notification createNotificationFromRequest(NotificationRequest notificationRequest) {
    return Notification.builder()
      .customerId(notificationRequest.customerId())
      .customerEmail(notificationRequest.customerEmail())
      .senderName("John Travolta")
      .notificationMessage(notificationRequest.notificationMessage())
      .sentTimestamp(LocalDateTime.now())
      .build();
  }
}
