FROM openjdk:17-jdk-slim

WORKDIR /app

COPY pom.xml mvnw ./
COPY .mvn .mvn

RUN ./mvnw dependency:go-offline

COPY src ./src

RUN ./mvnw clean package -DskipTests

EXPOSE 8081
CMD ["java", "-jar", "target/userservices-0.0.1-SNAPSHOT.jar"]





