FROM openjdk:21-jdk

WORKDIR /app

COPY /target/docker-demo-0.0.1-SNAPSHOT.jar /app/docker-demo-0.0.1-SNAPSHOT.jar

EXPOSE 1200

CMD ["java", "-jar" ,"docker-demo-0.0.1-SNAPSHOT.jar"]


