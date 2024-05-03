package com.example.servicenotification.rabbitmq;

import com.example.feignservice.notification.NotificationRequest;
import com.example.servicenotification.services.NotificationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class NotificationRabbitMqConsumer {

  private final NotificationService notificationService;

  @RabbitListener(queues = "${rabbitmq.queues.notification}")
  public void consumer(NotificationRequest notificationRequest) {
    try {
      log.info("Processing notification for user with ID: {} and message: '{}'", notificationRequest.customerId(), notificationRequest.notificationMessage());
      notificationService.send(notificationRequest);
      log.info("Successfully sent notification to user with ID: {}", notificationRequest.customerId());
    } catch (Exception e) {
      log.error("Failed to send notification for user with ID: {}. Error: {}", notificationRequest.customerId(), e.getMessage(), e);
    }
  }
}
