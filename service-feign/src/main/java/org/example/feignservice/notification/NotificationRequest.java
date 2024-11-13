package org.example.feignservice.notification;

/**
 * Represents a request to send a notification to a customer.
 * This record contains the necessary information, including the customer ID, email,
 * and the notification message to be sent.
 *
 * @param customerId the unique ID of the customer
 * @param customerEmail the email address of the customer to receive the notification
 * @param notificationMessage the message content to be sent to the customer
 */
public record NotificationRequest(
    Integer customerId,
    String customerEmail,
    String notificationMessage
) {
}
