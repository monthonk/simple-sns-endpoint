FROM openjdk:11-jre-slim

WORKDIR /usr/src/app
COPY target/simple-sns-endpoint-*.jar startup.sh /usr/src/app/
RUN chmod 755 startup.sh

EXPOSE 8080
ENTRYPOINT /usr/src/app/startup.sh