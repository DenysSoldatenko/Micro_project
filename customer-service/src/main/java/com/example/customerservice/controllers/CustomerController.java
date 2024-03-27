package com.example.customerservice.controllers;

import com.example.customerservice.dtos.CustomerDto;
import com.example.customerservice.services.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("api/v1/customer")
public class CustomerController {

  private final CustomerService customerService;

  @PostMapping
  public void registerCustomer(@RequestBody CustomerDto request) {
    log.info("Received request to register new customer: {}", request);
    customerService.registerCustomer(request);
  }
}