package com.example.fraudservice.services;

import static com.example.fraudservice.utils.FraudCheckHistoryUtil.createFraudCheckHistory;

import com.example.feignservice.fraud.FraudCheckResponse;
import com.example.feignservice.fraud.FraudsterException;
import com.example.fraudservice.entities.FraudCheckHistory;
import com.example.fraudservice.mappers.FraudCheckHistoryMapper;
import com.example.fraudservice.repositories.FraudCheckHistoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FraudCheckHistoryServiceImpl implements FraudCheckHistoryService {

  private final FraudCheckHistoryMapper fraudCheckHistoryMapper;
  private final FraudCheckHistoryRepository fraudCheckHistoryRepository;

  @Override
  public FraudCheckResponse checkFraudStatus(Integer customerId) {
    FraudCheckHistory fraudCheckHistory = fraudCheckHistoryRepository.findByCustomerId(customerId);

    if (fraudCheckHistory == null) {
      boolean isFraudster = (customerId % 2 == 0);
      fraudCheckHistory = createFraudCheckHistory(customerId, isFraudster);
      fraudCheckHistoryRepository.save(fraudCheckHistory);
    }

    if (fraudCheckHistory.getIsFraudster()) {
      throw new FraudsterException("Customer is a fraudster!");
    }

    return fraudCheckHistoryMapper.toDto(fraudCheckHistory);
  }
}
