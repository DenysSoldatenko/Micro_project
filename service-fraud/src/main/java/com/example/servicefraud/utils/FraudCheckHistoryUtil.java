package com.example.servicefraud.utils;

import com.example.servicefraud.entities.FraudCheckHistory;
import java.time.LocalDateTime;
import lombok.experimental.UtilityClass;

/**
 * Utility class for creating instances of {@link FraudCheckHistory}.
 * Contains methods to generate fraud check history records.
 */
@UtilityClass
public class FraudCheckHistoryUtil {

  /**
   * Creates a new {@link FraudCheckHistory} instance.
   *
   * @param customerId the ID of the customer
   * @param isFraudster flag indicating whether the customer is a fraudster
   * @return a new {@link FraudCheckHistory} instance
   */
  public static FraudCheckHistory createFraudCheckHistory(Integer customerId, boolean isFraudster) {
    return FraudCheckHistory.builder()
      .customerId(customerId)
      .isFraudster(isFraudster)
      .createdAt(LocalDateTime.now())
      .build();
  }
}
