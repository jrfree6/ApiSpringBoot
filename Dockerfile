FROM openjdk

WORDIR /app

COPY target/ApiSpringboot-0.0.1-SNAPSHOT.jar /app/apispringapp.jar

ENTRYPOINT ["java", "-jar", "apispringapp.jar"]
