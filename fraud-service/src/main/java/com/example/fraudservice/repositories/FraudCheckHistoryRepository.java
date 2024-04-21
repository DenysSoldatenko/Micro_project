package com.example.fraudservice.repositories;

import com.example.fraudservice.entities.FraudCheckHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudCheckHistoryRepository extends JpaRepository<FraudCheckHistory, Integer> {

  FraudCheckHistory findByCustomerId(int customerId);
}