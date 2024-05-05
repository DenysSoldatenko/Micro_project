package com.example.servicecustomer.services;

import com.example.servicecustomer.dtos.CustomerDto;
import com.example.servicecustomer.entities.Customer;
import com.example.servicecustomer.mappers.CustomerMapper;
import com.example.servicecustomer.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.example.feignservice.fraud.FraudServiceClient;
import org.example.feignservice.notification.NotificationRequest;
import org.example.serviceamqp.RabbitMqMessageProducer;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

  private final CustomerMapper customerMapper;
  private final CustomerRepository customerRepository;

  private final FraudServiceClient fraudServiceClient;
  private final RabbitMqMessageProducer rabbitMqMessageProducer;

  @Override
  public void registerCustomer(CustomerDto request) {
    Customer customer = customerMapper.toDto(request);
    customerRepository.saveAndFlush(customer);

    fraudServiceClient.checkFraudStatus(customer.getId());

    NotificationRequest notificationRequest = new NotificationRequest(
      customer.getId(),
      customer.getEmail(),
      String.format("Hi %s, welcome to the world of microservices!", customer.getFirstName())
    );

    rabbitMqMessageProducer.publish(notificationRequest, "internal.exchange", "internal.notification.routing-key");
  }
}
