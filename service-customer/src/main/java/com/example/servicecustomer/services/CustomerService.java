package com.example.servicecustomer.services;

import com.example.servicecustomer.dtos.CustomerDto;

/**
 * Service interface for handling customer-related operations.
 * Provides methods for customer registration and other customer-related business logic.
 */
public interface CustomerService {

  /**
   * Registers a new customer with the provided details.
   *
   * @param request the customer data for registration
   */
  void registerCustomer(CustomerDto request);
}
