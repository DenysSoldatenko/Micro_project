package com.example.fraudservice.controllers;

import com.example.fraudservice.services.FraudCheckHistoryService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/fraud-status")
@AllArgsConstructor
@Slf4j
public class FraudController {

  private final FraudCheckHistoryService fraudCheckHistoryService;

  @GetMapping(path = "/{customerId}")
  public String checkFraudStatus(@PathVariable("customerId") Integer customerId) {
//    boolean isFraudulentCustomer = fraudCheckHistoryService.isFraudulentCustomer(customerId);
//    log.info("Fraud check request for customer {}", customerId);
//
//    return new FraudStatusResponse(isFraudulentCustomer);
  }
}
