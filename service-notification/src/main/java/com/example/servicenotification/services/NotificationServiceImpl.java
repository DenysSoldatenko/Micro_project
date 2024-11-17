package com.example.servicenotification.services;

import static com.example.servicenotification.utils.NotificationUtils.createNotificationFromRequest;

import com.example.servicenotification.entities.Notification;
import com.example.servicenotification.repositories.NotificationRepository;
import lombok.AllArgsConstructor;
import org.example.feignservice.notification.NotificationRequest;
import org.springframework.stereotype.Service;

/**
 * Implementation of the NotificationService interface, responsible for handling
 * the logic of saving notifications to the database.
 */
@Service
@AllArgsConstructor
public class NotificationServiceImpl implements NotificationService {

  private final NotificationRepository notificationRepository;

  /**
   * Sends a notification by saving it to the repository.
   *
   * @param request the notification details to be saved
   */
  @Override
  public void send(NotificationRequest request) {
    Notification notification = createNotificationFromRequest(request);
    notificationRepository.save(notification);
  }
}
