package com.example.customerservice.services;

import com.example.customerservice.dtos.CustomerDto;

public interface CustomerService {
  void registerCustomer(CustomerDto request);
}
