package org.example.serviceamqp;

import lombok.AllArgsConstructor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for RabbitMQ setup.
 * Configures beans for sending and receiving messages using RabbitMQ,
 * including a custom message converter.
 */
@Configuration
@AllArgsConstructor
public class RabbitMqConfiguration {

  private final ConnectionFactory connectionFactory;

  /**
   * Creates and configures an {@link AmqpTemplate} for sending messages to RabbitMQ.
   *
   * @return configured {@link AmqpTemplate}
   */
  @Bean
  public AmqpTemplate amqpTemplate() {
    RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
    rabbitTemplate.setMessageConverter(jacksonConverter());
    return rabbitTemplate;
  }

  /**
   * Configures a {@link SimpleRabbitListenerContainerFactory} for receiving messages from RabbitMQ.
   *
   * @return configured {@link SimpleRabbitListenerContainerFactory}
   */
  @Bean
  public SimpleRabbitListenerContainerFactory simpleRabbitListenerContainerFactory() {
    SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
    factory.setConnectionFactory(connectionFactory);
    factory.setMessageConverter(jacksonConverter());
    return factory;
  }

  /**
   * Configures a {@link MessageConverter} for converting messages to/from JSON using Jackson.
   *
   * @return configured {@link MessageConverter}
   */
  @Bean
  public MessageConverter jacksonConverter() {
    return new Jackson2JsonMessageConverter();
  }
}
