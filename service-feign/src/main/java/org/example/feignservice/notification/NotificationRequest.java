package org.example.feignservice.notification;

public record NotificationRequest(
  Integer customerId,
  String customerEmail,
  String notificationMessage
) {
}