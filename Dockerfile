# Use JDK 17 as the base
FROM openjdk:17-jdk-alpine

# Copy the JAR file to the container
COPY target/*.jar app.jar

# Expose the port the application will listen on
EXPOSE 8080

# Specify the command to run the application
ENTRYPOINT ["java","-jar","/app.jar"]