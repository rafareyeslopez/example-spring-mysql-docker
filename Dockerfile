FROM openjdk:11-slim
VOLUME /tmp
ENV TZ=Europe/Madrid
RUN ln -snf "/usr/share/zoneinfo/$TZ/" "etc/localtime" && echo "$TZ" > "/etc/timezone"
COPY target/example-spring-mysql-docker-0.0.1-SNAPSHOT.jar example-spring-mysql-docker.jar
EXPOSE 8080
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","example-spring-mysql-docker.jar"]

