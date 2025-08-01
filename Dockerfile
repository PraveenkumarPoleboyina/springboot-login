# Step 1: Build the app with Maven
FROM maven:3.8.5-openjdk-17-slim AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Step 2: Run the built app
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

# Render uses environment variable PORT, so map it dynamically
ENV PORT=10000
EXPOSE 10000

# Make the app use dynamic port
ENTRYPOINT ["sh", "-c", "java -jar app.jar --server.port=$PORT"]
