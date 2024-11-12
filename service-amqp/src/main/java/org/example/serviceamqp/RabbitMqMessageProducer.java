package org.example.serviceamqp;

import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

/**
 * RabbitMqMessageProducer is responsible for publishing messages to a specified RabbitMQ exchange.
 *
 * <p>This component provides functionality to send messages
 * to a RabbitMQ exchange with a given routing key.
 *
 * <p>It logs the message publishing details, including the payload size,
 * timestamp, and success or failure status.
 */
@Slf4j
@Component
@AllArgsConstructor
public class RabbitMqMessageProducer {

  private final AmqpTemplate amqpTemplate;

  /**
   * Publishes a message to the specified exchange and routing key.
   *
   * @param payload the message payload
   * @param exchange the exchange name
   * @param routingKey the routing key for the message
   */
  public void publish(Object payload, String exchange, String routingKey) {
    long timestamp = System.currentTimeMillis();
    int payloadSize = (payload != null) ? payload.toString().length() : 0;

    log.info("Publishing message to exchange: {} "
        + "with routingKey: {}. "
        + "Payload size: {} bytes. "
        + "Timestamp: {}. "
        + "Payload: {}", exchange, routingKey, payloadSize,
        timestamp, Optional.ofNullable(payload).orElse("null")
    );

    try {
      amqpTemplate.convertAndSend(exchange, routingKey, payload);
      log.info("Successfully published message to exchange: {} "
          + "with routingKey: {}. "
          + "Payload size: {} bytes. "
          + "Timestamp: {}.",
          exchange, routingKey, payloadSize, timestamp
      );
    } catch (Exception e) {
      log.error("Failed to publish message to exchange: {} with routingKey: {}. Error: {}",
          exchange, routingKey, e.getMessage(), e
      );
    }
  }
}
