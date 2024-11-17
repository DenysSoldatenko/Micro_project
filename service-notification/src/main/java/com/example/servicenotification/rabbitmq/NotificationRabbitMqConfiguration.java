package com.example.servicenotification.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for RabbitMQ components.
 * It defines the exchange, queue, and binding for notifications.
 */
@Configuration
public class NotificationRabbitMqConfiguration {

  @Value("${rabbitmq.exchanges.internal}")
  private String internalExchangeValue;

  @Value("${rabbitmq.queues.notification}")
  private String notificationQueueValue;

  @Value("${rabbitmq.routing-keys.internal-notification}")
  private String internalNotificationRoutingKeyValue;

  /**
   * Defines the TopicExchange for internal messaging.
   *
   * @return the configured TopicExchange
   */
  @Bean
  public TopicExchange internalTopicExchange() {
    return new TopicExchange(internalExchangeValue);
  }

  /**
   * Defines the notification queue.
   *
   * @return the configured Queue for notifications
   */
  @Bean
  public Queue notificationQueue() {
    return new Queue(notificationQueueValue);
  }

  /**
   * Binds the notification queue to the internal exchange using the specified routing key.
   *
   * @return the Binding between the queue and the exchange
   */
  @Bean
  public Binding internalToNotificationBinding() {
    return BindingBuilder
      .bind(notificationQueue())
      .to(internalTopicExchange())
      .with(internalNotificationRoutingKeyValue);
  }
}
