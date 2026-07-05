# Use Eclipse Temurin Java 21 JDK
FROM eclipse-temurin:21-jdk

# Set working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/tourism_info_portal-0.0.1-SNAPSHOT.jar app.jar

# Expose the Spring Boot port
EXPOSE 8081
EXPOSE 9090

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]