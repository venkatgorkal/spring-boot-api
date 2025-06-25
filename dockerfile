FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY target/person-api-0.0.2.jar person-api.jar
ENTRYPOINT ["java","-jar","/person-api.jar"]