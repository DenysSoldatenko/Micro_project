package com.example.servicefraud.controllers;

import com.example.servicefraud.services.FraudCheckHistoryService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.feignservice.fraud.FraudCheckResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller that handles requests related to fraud status.
 * Provides an endpoint to check a customer's fraud status.
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("api/v1/fraud-status")
public class FraudController {

  private final FraudCheckHistoryService fraudCheckHistoryService;

  /**
   * Endpoint to check the fraud status of a customer by their ID.
   *
   * @param customerId the ID of the customer whose fraud status is being checked
   * @return a {@link FraudCheckResponse} indicating whether the customer is a fraudster
   */
  @GetMapping(path = "/{customerId}")
  public FraudCheckResponse checkFraudStatus(@PathVariable("customerId") Integer customerId) {
    FraudCheckResponse fraudCheckResponse = fraudCheckHistoryService.checkFraudStatus(customerId);
    log.info("Fraud check completed for customer ID: {}. "
        + "Fraud status: {}", customerId, fraudCheckResponse.isFraudster()
    );
    return fraudCheckResponse;
  }
}
