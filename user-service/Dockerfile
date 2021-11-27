FROM openjdk:8-jre
COPY target/user-service-1.0.jar user-service.jar
RUN apt-get update && apt-get install -y netcat
ENTRYPOINT ["java","-jar","/user-service-1.0.jar"]