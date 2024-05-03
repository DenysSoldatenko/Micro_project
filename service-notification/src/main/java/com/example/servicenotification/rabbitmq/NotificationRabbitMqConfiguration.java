package com.example.servicenotification.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificationRabbitMqConfiguration {

  @Value("${rabbitmq.exchanges.internal}")
  private String internalExchangeValue;

  @Value("${rabbitmq.queues.notification}")
  private String notificationQueueValue;

  @Value("${rabbitmq.routing-keys.internal-notification}")
  private String internalNotificationRoutingKeyValue;

  @Bean
  public TopicExchange internalTopicExchange() {
    return new TopicExchange(internalExchangeValue);
  }

  @Bean
  public Queue notificationQueue() {
    return new Queue(notificationQueueValue);
  }

  @Bean
  public Binding internalToNotificationBinding() {
    return BindingBuilder
      .bind(notificationQueue())
      .to(internalTopicExchange())
      .with(internalNotificationRoutingKeyValue);
  }
}