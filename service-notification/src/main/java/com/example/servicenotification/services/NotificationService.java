package com.example.servicenotification.services;

import com.example.feignservice.notification.NotificationRequest;

public interface NotificationService {
  void send(NotificationRequest request);
}
