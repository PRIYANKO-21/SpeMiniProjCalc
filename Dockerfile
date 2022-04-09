FROM openjdk:8
COPY target/speminiproject-1.0-SNAPSHOT.jar speminiproject-1.0-SNAPSHOT.jar
CMD ["java","-cp","speminiproject-1.0-SNAPSHOT.jar","Calculator"]