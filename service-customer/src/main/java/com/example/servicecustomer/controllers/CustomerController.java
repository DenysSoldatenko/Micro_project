package com.example.servicecustomer.controllers;

import com.example.servicecustomer.dtos.CustomerDto;
import com.example.servicecustomer.services.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for managing customer-related endpoints.
 * Provides an endpoint to register a new customer.
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("api/v1/customer")
public class CustomerController {

  private final CustomerService customerService;

  /**
   * Endpoint to register a new customer.
   *
   * @param request the customer registration data
   */
  @PostMapping
  public void registerCustomer(@RequestBody CustomerDto request) {
    log.info("Received request to register new customer: {}", request);
    customerService.registerCustomer(request);
  }
}
