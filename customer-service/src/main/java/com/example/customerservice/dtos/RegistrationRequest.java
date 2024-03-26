package com.example.customerservice.dtos;

public record RegistrationRequest(
  String firstName,
  String lastName,
  String email
) {
}