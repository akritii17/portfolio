
# Stage 1: Build application using Maven and Java 21
FROM maven:3.9-eclipse-temurin-21 AS build

WORKDIR /app

# Copy Maven configuration
COPY pom.xml .

# Download dependencies
RUN mvn dependency:go-offline -B

# Copy application source code
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests -B

# Stage 2: Run application using Java 21 JRE
FROM eclipse-temurin:21-jre

WORKDIR /app

# Copy generated Spring Boot JAR
COPY --from=build /app/target/*.jar app.jar

# Expose Spring Boot default port
EXPOSE 8081

# Run application
ENTRYPOINT ["java", "-jar", "app.jar"]
