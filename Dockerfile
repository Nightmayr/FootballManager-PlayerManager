
FROM openjdk
ADD target/FootballManager-PlayerManager-0.0.1-SNAPSHOT.jar FootballManager-PlayerManager-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/FootballManager-PlayerManager-0.0.1-SNAPSHOT.jar"]
EXPOSE 8082


