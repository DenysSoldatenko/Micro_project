package org.example.feignservice.fraud;

/**
 * Custom exception to represent a fraudster-related error.
 * This exception is thrown when a fraud-related condition is encountered in the system.
 */
public class FraudsterException extends RuntimeException {

  /**
   * Constructs a new {@link FraudsterException} with the specified detail message.
   *
   * @param message the detail message explaining the reason for the exception
   */
  public FraudsterException(String message) {
    super(message);
  }
}
