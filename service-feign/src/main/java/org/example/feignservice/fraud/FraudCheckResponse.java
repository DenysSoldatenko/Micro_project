package org.example.feignservice.fraud;

/**
 * Represents the response from a fraud check service.
 * Contains information about whether a user is identified as a fraudster.
 *
 * @param isFraudster a boolean indicating if the user is a fraudster
 */
public record FraudCheckResponse(Boolean isFraudster) {
}