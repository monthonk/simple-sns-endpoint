FROM openjdk:11-jre-slim

ARG AWS_CREDENTIAL_FILE=src/main/resources/credentials
COPY ${AWS_CREDENTIAL_FILE} /root/.aws/credentials
WORKDIR /usr/src/app
COPY target/simple-sns-endpoint-*.jar /usr/src/app

EXPOSE 8080
ENTRYPOINT java -jar simple-sns-endpoint-*.jar