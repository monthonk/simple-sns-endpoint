FROM openjdk:8-jre-alpine

WORKDIR /usr/src/app
COPY target/simple-sns-endpoint-*.jar /usr/src/app
RUN chmod 755 /usr/src/app/simple-sns-endpoint-*.jar

EXPOSE 8080
ENTRYPOINT java -jar simple-sns-endpoint-*.jar