package com.example.fraudservice.utils;

import com.example.fraudservice.entities.FraudCheckHistory;
import lombok.experimental.UtilityClass;

import java.time.LocalDateTime;

@UtilityClass
public class FraudCheckHistoryUtil {

  public static FraudCheckHistory createFraudCheckHistory(Integer customerId, boolean isFraudster) {
    return FraudCheckHistory.builder()
      .customerId(customerId)
      .isFraudster(isFraudster)
      .createdAt(LocalDateTime.now())
      .build();
  }
}
