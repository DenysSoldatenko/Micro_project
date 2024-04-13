package com.example.fraudservice.controllers;

import com.example.fraudservice.dtos.FraudCheckResponse;
import com.example.fraudservice.services.FraudCheckHistoryService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("api/v1/fraud-status")
public class FraudController {

  private final FraudCheckHistoryService fraudCheckHistoryService;

  @GetMapping(path = "/{customerId}")
  public FraudCheckResponse checkFraudStatus(@PathVariable("customerId") Integer customerId) {
    FraudCheckResponse fraudCheckResponse = fraudCheckHistoryService.isFraudulentCustomer(customerId);
    log.info("Fraud check completed for customer ID: {}. Fraud status: {}", customerId, fraudCheckResponse.isFraudster());
    return fraudCheckResponse;
  }
}
