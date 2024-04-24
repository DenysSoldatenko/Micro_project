package com.example.feignservice.fraud;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class FraudExceptionHandler {

  @ExceptionHandler(FraudsterException.class)
  public ResponseEntity<String> handleFraudsterException(FraudsterException ex) {
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
  }
}
