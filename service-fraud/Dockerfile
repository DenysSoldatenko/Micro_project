FROM openjdk:17-jdk-slim

WORKDIR /service-fraud

COPY build/libs/*.jar application.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "application.jar"]
