FROM openjdk:17-jdk-slim

WORKDIR /service-customer

COPY build/libs/*.jar application.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "application.jar"]
