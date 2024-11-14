package com.example.servicefraud.repositories;

import com.example.servicefraud.entities.FraudCheckHistory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for accessing {@link FraudCheckHistory} entities.
 * Provides methods to interact with the fraud check history data in the database.
 */
public interface FraudCheckHistoryRepository extends JpaRepository<FraudCheckHistory, Integer> {

  /**
   * Finds a {@link FraudCheckHistory} by the customer's ID.
   *
   * @param customerId the ID of the customer
   * @return the corresponding fraud check history, or null if not found
   */
  FraudCheckHistory findByCustomerId(int customerId);
}
