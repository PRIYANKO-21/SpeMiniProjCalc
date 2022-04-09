FROM openjdk:8
COPY target/SpeCalculator-1.0-SNAPSHOT.jar SpeCalculator-1.0-SNAPSHOT.jar
CMD ["java","-cp","SpeCalculator-1.0-SNAPSHOT.jar","Calculator"]