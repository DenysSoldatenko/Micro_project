package com.example.customerservice.services;

import com.example.customerservice.dtos.RegistrationRequest;

public interface CustomerService {
  void registerCustomer(RegistrationRequest request);
}
