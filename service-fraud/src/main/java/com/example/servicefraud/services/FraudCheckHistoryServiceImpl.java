package com.example.servicefraud.services;

import static com.example.servicefraud.utils.FraudCheckHistoryUtil.createFraudCheckHistory;

import com.example.servicefraud.entities.FraudCheckHistory;
import com.example.servicefraud.mappers.FraudCheckHistoryMapper;
import com.example.servicefraud.repositories.FraudCheckHistoryRepository;
import lombok.AllArgsConstructor;
import org.example.feignservice.fraud.FraudCheckResponse;
import org.example.feignservice.fraud.FraudsterException;
import org.springframework.stereotype.Service;

/**
 * Implementation of the {@link FraudCheckHistoryService} interface.
 * Handles fraud status checks and maintains fraud check history for customers.
 */
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
