package com.example.servicenotification.utils;

import org.example.feignservice.notification.NotificationRequest;
import com.example.servicenotification.entities.Notification;
import lombok.experimental.UtilityClass;

import java.time.LocalDateTime;

@UtilityClass
public class NotificationUtils {

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
