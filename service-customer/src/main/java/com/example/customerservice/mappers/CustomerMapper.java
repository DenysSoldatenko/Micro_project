package com.example.customerservice.mappers;

import com.example.customerservice.dtos.CustomerDto;
import com.example.customerservice.entities.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

  CustomerDto toModel(Customer customer);

  Customer toDto(CustomerDto customerDto);
}
