package com.example.fraudservice.services;

import com.example.fraudservice.dtos.FraudCheckResponse;

public interface FraudCheckHistoryService {
  FraudCheckResponse checkFraudStatus(Integer customerId);
}
