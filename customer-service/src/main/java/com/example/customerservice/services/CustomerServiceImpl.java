package com.example.customerservice.services;

import com.example.customerservice.dtos.RegistrationRequest;
import com.example.customerservice.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public void registerCustomer(RegistrationRequest request) {

    }
}
