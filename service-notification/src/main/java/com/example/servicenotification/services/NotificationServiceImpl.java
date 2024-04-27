package com.example.servicenotification.services;

import static com.example.servicenotification.utils.NotificationUtils.createNotificationFromRequest;

import com.example.feignservice.notification.NotificationRequest;
import com.example.servicenotification.entities.Notification;
import com.example.servicenotification.repositories.NotificationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NotificationServiceImpl implements NotificationService {

  private final NotificationRepository notificationRepository;

  @Override
  public void send(NotificationRequest request) {
    Notification notification = createNotificationFromRequest(request);
    notificationRepository.save(notification);
  }
}
