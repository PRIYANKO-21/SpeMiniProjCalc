FROM openjdk:11
COPY target/SpeCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar SpeCalculator-1.0-SNAPSHOT.jar
CMD ["java","-cp","SpeCalculator-1.0-SNAPSHOT.jar","Calculator"]
