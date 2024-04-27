package com.example.feignservice.notification;

import com.example.feignservice.fraud.FraudCheckResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
  name = "service-notification",
  url = "http://localhost:8083"
)
public interface NotificationServiceClient {

  @PostMapping(path = "api/v1/notification")
  FraudCheckResponse sendNotification(@RequestBody NotificationRequest request);
}