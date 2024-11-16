package com.example.servicecustomer.repositories;

import com.example.servicecustomer.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for performing CRUD operations on {@link Customer} entities.
 * Extends {@link JpaRepository} to provide standard database operations.
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
