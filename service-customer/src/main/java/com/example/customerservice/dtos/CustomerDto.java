package com.example.customerservice.dtos;

public record CustomerDto(
  String firstName,
  String lastName,
  String email
) {
}