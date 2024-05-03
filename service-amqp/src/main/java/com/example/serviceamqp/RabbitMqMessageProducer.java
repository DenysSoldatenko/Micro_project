package com.example.serviceamqp;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Slf4j
@Component
@AllArgsConstructor
public class RabbitMqMessageProducer {

  private final AmqpTemplate amqpTemplate;

  public void publish(Object payload, String exchange, String routingKey) {
    long timestamp = System.currentTimeMillis();
    int payloadSize = (payload != null) ? payload.toString().length() : 0;

    log.info("Publishing message to exchange: {} with routingKey: {}. Payload size: {} bytes. Timestamp: {}. Payload: {}",
      exchange, routingKey, payloadSize, timestamp, Optional.ofNullable(payload).orElse("null"));

    try {
      amqpTemplate.convertAndSend(exchange, routingKey, payload);
      log.info("Successfully published message to exchange: {} with routingKey: {}. Payload size: {} bytes. Timestamp: {}.",
        exchange, routingKey, payloadSize, timestamp);
    } catch (Exception e) {
      log.error("Failed to publish message to exchange: {} with routingKey: {}. Error: {}", exchange, routingKey, e.getMessage(), e);
    }
  }
}
