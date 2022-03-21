FROM adoptopenjdk/openjdk11:alpine
MAINTAINER Michał Mazur
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} /shd.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/shd.jar"]