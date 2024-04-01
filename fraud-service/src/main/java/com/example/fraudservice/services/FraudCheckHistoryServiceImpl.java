package com.example.fraudservice.services;

import static com.example.fraudservice.utils.FraudCheckHistoryUtil.createFraudCheckHistory;

import com.example.fraudservice.entities.FraudCheckHistory;
import com.example.fraudservice.repositories.FraudCheckHistoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FraudCheckHistoryServiceImpl implements FraudCheckHistoryService {

  private final FraudCheckHistoryRepository fraudCheckHistoryRepository;

  @Override
  public void isFraudulentCustomer(Integer customerId) {
    FraudCheckHistory fraudCheckHistory = createFraudCheckHistory(customerId);
    fraudCheckHistoryRepository.save(fraudCheckHistory);
  }
}
