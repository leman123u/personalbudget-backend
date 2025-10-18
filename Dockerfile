FROM openjdk:17-jdk-slim

# 2) Builddən çıxan JAR-ı konteynerə kopyala
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app.jar

# 3) Port
EXPOSE 8081

# 4) Başlatma komandası
ENTRYPOINT ["java","-jar","/app.jar"]