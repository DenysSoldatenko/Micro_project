package com.example.servicecustomer.mappers;

import com.example.servicecustomer.dtos.CustomerDto;
import com.example.servicecustomer.entities.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

  CustomerDto toModel(Customer customer);

  Customer toDto(CustomerDto customerDto);
}
