FROM openjdk:17-jdk-slim

WORKDIR /service-notification

COPY build/libs/*.jar application.jar

EXPOSE 8083

ENTRYPOINT ["java", "-jar", "application.jar"]
