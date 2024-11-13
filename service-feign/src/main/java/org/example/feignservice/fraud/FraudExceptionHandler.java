package org.example.feignservice.fraud;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Global exception handler for handling {@link FraudsterException} in the application.
 * This class provides a centralized mechanism for handling fraud-related exceptions and
 * returning appropriate HTTP responses.
 */
@ControllerAdvice
public class FraudExceptionHandler {

  /**
   * Handles {@link FraudsterException}
   * and returns a {@link ResponseEntity} with a BAD_REQUEST status.
   *
   * @param ex the {@link FraudsterException} that was thrown
   * @return a {@link ResponseEntity} containing the exception message with BAD_REQUEST status
   */
  @ExceptionHandler(FraudsterException.class)
  public ResponseEntity<String> handleFraudsterException(FraudsterException ex) {
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
  }
}
