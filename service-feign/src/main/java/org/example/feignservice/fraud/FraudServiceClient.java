package org.example.feignservice.fraud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Feign client interface for interacting with the fraud detection service.
 * This client communicates with the external fraud service to check the fraud status
 * of a given customer based on their customer ID.
 */
@FeignClient(
    name = "service-fraud",
    url = "${service-fraud.url}"
)
public interface FraudServiceClient {

  /**
   * Checks the fraud status of a customer by their customer ID.
   *
   * @param customerId the ID of the customer whose fraud status is to be checked
   * @return a {@link FraudCheckResponse} indicating whether the customer is a fraudster
   */
  @GetMapping(path = "api/v1/fraud-status/{customerId}")
  FraudCheckResponse checkFraudStatus(@PathVariable("customerId") Integer customerId);
}
