package com.example.servicecustomer.services;

import com.example.servicecustomer.dtos.CustomerDto;

public interface CustomerService {
  void registerCustomer(CustomerDto request);
}
