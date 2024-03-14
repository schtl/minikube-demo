# get from https://hub.docker.com/
FROM eclipse-temurin:17-jre

RUN mkdir -p /opt/application
# from context folder
COPY *-runner.jar /opt/application/backend.jar
WORKDIR /opt/application
# start command for the docker to stand by
CMD [ "java", "-jar", "backend.jar" ]
