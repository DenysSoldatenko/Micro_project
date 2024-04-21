package com.example.feignservice.fraud;

public class FraudsterException extends RuntimeException {
  public FraudsterException(String message) {
    super(message);
  }
}
