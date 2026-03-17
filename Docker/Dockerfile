FROM eclipse-temurin:21-jre

RUN mkdir /opt/application
# from target folder
COPY *.jar /opt/application/backend.jar
WORKDIR /opt/application
CMD ["java", "-jar", "backend.jar"]
