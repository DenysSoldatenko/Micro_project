package com.example.servicefraud.services;

import org.example.feignservice.fraud.FraudCheckResponse;

public interface FraudCheckHistoryService {
  FraudCheckResponse checkFraudStatus(Integer customerId);
}
