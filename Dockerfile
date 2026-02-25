
FROM eclipse-temurin:21-jre

WORKDIR /app

COPY  target/nexus-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 4040

ENTRYPOINT ["java", "-jar", "app.jar"]

