FROM openjdk:8
MAINTAINER skymarlio
VOLUME /tmp
ADD gradle-spring-boot-project-0.1.0-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]