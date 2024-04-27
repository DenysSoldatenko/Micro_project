package com.example.customerservice.services;

import com.example.customerservice.dtos.CustomerDto;
import com.example.customerservice.entities.Customer;
import com.example.customerservice.mappers.CustomerMapper;
import com.example.customerservice.repositories.CustomerRepository;
import com.example.feignservice.fraud.FraudServiceClient;
import com.example.feignservice.notification.NotificationRequest;
import com.example.feignservice.notification.NotificationServiceClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

  private final CustomerMapper customerMapper;
  private final CustomerRepository customerRepository;

  private final FraudServiceClient fraudServiceClient;
  private final NotificationServiceClient notificationServiceClient;

  @Override
  public void registerCustomer(CustomerDto request) {
    Customer customer = customerMapper.toDto(request);
    customerRepository.saveAndFlush(customer);

    fraudServiceClient.checkFraudStatus(customer.getId());

    NotificationRequest notificationRequest = new NotificationRequest(
      customer.getId(),
      customer.getEmail(),
      String.format("Hi %s, welcome to microservice world!", customer.getFirstName())
    );
    notificationServiceClient.sendNotification(notificationRequest);
  }
}
