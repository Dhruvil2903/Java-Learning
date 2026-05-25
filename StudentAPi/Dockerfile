# Use Java 21
FROM eclipse-temurin:21-jdk-alpine

# Create working directory inside container
WORKDIR /app

# Copy the Spring Boot jar into container
COPY target/*.jar app.jar

# Expose Spring Boot default port
EXPOSE 8080

# Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]