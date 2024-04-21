package com.example.fraudservice.services;

import com.example.feignservice.fraud.FraudCheckResponse;

public interface FraudCheckHistoryService {
  FraudCheckResponse checkFraudStatus(Integer customerId);
}
