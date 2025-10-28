# Usamos la imagen oficial de Java 21 JDK
FROM openjdk:21-jdk-slim

# Carpeta de trabajo dentro del contenedor
WORKDIR /app

# Copiamos el JAR compilado desde target al contenedor
COPY target/dance-academy-api-0.0.1-SNAPSHOT.jar app.jar

# Exponemos el puerto de Spring Boot
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
