package com.example.servicenotification.services;

import org.example.feignservice.notification.NotificationRequest;

public interface NotificationService {
  void send(NotificationRequest request);
}
