package com.example.servicefraud.repositories;

import com.example.servicefraud.entities.FraudCheckHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudCheckHistoryRepository extends JpaRepository<FraudCheckHistory, Integer> {

  FraudCheckHistory findByCustomerId(int customerId);
}