package com.example.servicecustomer.dtos;

/**
 * Data Transfer Object (DTO) for customer registration.
 * Contains customer details like first name, last name, and email.
 */
public record CustomerDto(
    String firstName,
    String lastName,
    String email
) {
}
