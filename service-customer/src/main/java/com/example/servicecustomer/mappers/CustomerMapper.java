package com.example.servicecustomer.mappers;

import com.example.servicecustomer.dtos.CustomerDto;
import com.example.servicecustomer.entities.Customer;
import org.mapstruct.Mapper;

/**
 * Mapper interface for converting between {@link Customer} entity and {@link CustomerDto}.
 * Provides methods for converting from entity to DTO and vice versa.
 */
@Mapper(componentModel = "spring")
public interface CustomerMapper {

  /**
   * Converts a {@link Customer} entity to a {@link CustomerDto}.
   *
   * @param customer the customer entity to convert
   * @return the corresponding {@link CustomerDto}
   */
  CustomerDto toModel(Customer customer);

  /**
   * Converts a {@link CustomerDto} to a {@link Customer} entity.
   *
   * @param customerDto the customer DTO to convert
   * @return the corresponding {@link Customer} entity
   */
  Customer toDto(CustomerDto customerDto);
}
