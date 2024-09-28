FROM openjdk:21-jdk

COPY target/docker-demo-0.0.1-SNAPSHOT.jar /app/demo.jar

EXPOSE 1200

CMD ["java -jar demo.jar"]

