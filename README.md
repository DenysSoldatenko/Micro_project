# Microservices Project

This repository contains a **microservices-based application** designed to demonstrate the implementation of a distributed system using various technologies and best practices for building scalable, reliable microservices.

## Project Structure

- **`k8s`**: Kubernetes deployment configurations for local development with Minikube.
- **`server-eureka`**: Service discovery using **Netflix Eureka**.
- **`service-amqp`**: Asynchronous messaging with **AMQP**.
- **`service-customer`**: Manages customer-related operations.
- **`service-feign`**: Simplifies service-to-service communication.
- **`service-fraud`**: Fraud detection service.
- **`service-gateway`**: API Gateway for routing and load balancing.
- **`service-notification`**: Handles notifications (e.g., email/SMS).

## Technologies Used

- **Spring Boot**: Framework for building the microservices.
- **Netflix Eureka**: Service discovery and registration.
- **AMQP (RabbitMQ)**: Asynchronous messaging between services.
- **Kubernetes**: Container orchestration for deploying microservices.
- **Docker**: Containerization of each microservice.
- **API Gateway**: To handle and route client requests.
