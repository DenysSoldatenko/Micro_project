package com.example.servicefraud.services;

import org.example.feignservice.fraud.FraudCheckResponse;

/**
 * Service interface for checking a customer's fraud status.
 * Provides method to interact with fraud check logic and retrieve fraud status.
 */
public interface FraudCheckHistoryService {

  /**
   * Checks the fraud status of a customer by their customer ID.
   *
   * @param customerId the ID of the customer
   * @return a {@link FraudCheckResponse} indicating whether the customer is a fraudster
   */
  FraudCheckResponse checkFraudStatus(Integer customerId);
}
