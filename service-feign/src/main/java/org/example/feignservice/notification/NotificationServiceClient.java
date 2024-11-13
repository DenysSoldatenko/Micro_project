package org.example.feignservice.notification;

import org.example.feignservice.fraud.FraudCheckResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Feign client interface for interacting with the notification service.
 * This client is responsible for sending notifications to customers.
 */
@FeignClient(
    name = "service-notification",
    url = "${service-notification.url}"
)
public interface NotificationServiceClient {

  /**
   * Sends a notification to a customer based on the provided notification request.
   *
   * @param request the {@link NotificationRequest} containing the customer details and message
   * @return a {@link FraudCheckResponse} indicating the result of the notification sending process
   */
  @PostMapping(path = "api/v1/notification")
  FraudCheckResponse sendNotification(@RequestBody NotificationRequest request);
}
