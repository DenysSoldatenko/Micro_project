package com.example.feignservice.fraud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
  name = "fraud-service",
  url = "http://localhost:8082"
)
public interface FraudServiceClient {

  @GetMapping(path = "api/v1/fraud-status/{customerId}")
  FraudCheckResponse checkFraudStatus(@PathVariable("customerId") Integer customerId);
}