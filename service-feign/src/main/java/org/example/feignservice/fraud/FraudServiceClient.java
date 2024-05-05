package org.example.feignservice.fraud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("service-fraud")
public interface FraudServiceClient {

  @GetMapping(path = "api/v1/fraud-status/{customerId}")
  FraudCheckResponse checkFraudStatus(@PathVariable("customerId") Integer customerId);
}